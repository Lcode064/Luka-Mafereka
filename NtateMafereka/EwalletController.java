
package NtateMafereka;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.stage.Stage;
public class EwalletController implements Initializable
{
    @FXML
    private ComboBox amount;

    @FXML
    private Label balance;

    @FXML
    private ComboBox company;

    @FXML
    private ComboBox phoneNumber;

    @FXML
     private Parent root;
    @FXML
    private Stage stage;
    @FXML
    private Scene scene;
     ObservableList<String> money=FXCollections.observableArrayList("M100","M300","M600");
     ObservableList<String> offers=FXCollections.observableArrayList("Econet Telcom","Vodacom Lesotho","MTN-Lesotho");
     ObservableList<String> Numbers=FXCollections.observableArrayList("+266 316 429","+266 584 854 42","+266 505 005 00");
    @FXML
     Alert ad = new Alert(Alert.AlertType.INFORMATION, "Converted Money to Ewallet",ButtonType.OK); 
    @FXML
    void profile(ActionEvent event) throws IOException {
       root = FXMLLoader.load(getClass().getResource("home.fxml"));
       stage=(Stage)((Node)event.getSource()).getScene().getWindow();
       scene=new Scene(root);
       stage.setScene(scene);
       stage.show();
    }
    @FXML
    void pay(ActionEvent event) throws IOException
    {
       root = FXMLLoader.load(getClass().getResource("payfees.fxml"));
       stage=(Stage)((Node)event.getSource()).getScene().getWindow();
       scene=new Scene(root);
       stage.setScene(scene);
       stage.show();
    }

    @FXML
    void sendMoney(ActionEvent event) throws IOException
    {
       root = FXMLLoader.load(getClass().getResource("sendMoney.fxml"));
       stage=(Stage)((Node)event.getSource()).getScene().getWindow();
       scene=new Scene(root);
       stage.setScene(scene);
       stage.show();
    }
    @FXML
    void crypto(ActionEvent event) throws IOException 
    {
       root = FXMLLoader.load(getClass().getResource("crypto.fxml"));
       stage=(Stage)((Node)event.getSource()).getScene().getWindow();
       scene=new Scene(root);
       stage.setScene(scene);
       stage.show();
    }
    @FXML
    void ewallet(ActionEvent event) throws IOException, SQLException
    {

       amount.getItems().addAll(money);
       company.getItems().addAll(offers);
       phoneNumber.getItems().addAll(Numbers);

    }
    @FXML
    void walley(ActionEvent event) throws IOException
    {
        String Money=(String) amount.getValue();
        String Company=(String) company.getValue();
        String Number=(String) phoneNumber.getValue();
        File mf=new File("wallet.txt");
        mf.createNewFile();
        String url="wallet.txt";
        FileWriter mfa=new FileWriter(url,true);
        try (BufferedWriter bf = new BufferedWriter(mfa)) {
            bf.append(Money+"\n");
            bf.append(Company+"\n");
            bf.append(Number+"\n");
            ad.show();
        }
    }
    @FXML
    void exitProgram(ActionEvent event)
    {
        Platform.exit();
        System.exit(0);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) 
    {
        amount.setItems((ObservableList) money);
        company.setItems((ObservableList)offers);
        phoneNumber.setItems((ObservableList)Numbers);
    }
}
