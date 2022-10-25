
package NtateMafereka;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
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
import javafx.scene.control.TextField;
import javafx.stage.Stage;
public class CryptoController implements Initializable
{
    
    @FXML
    private ComboBox amount;

    @FXML
    private Label balance;
    @FXML
    TextField username;

    @FXML
    private ComboBox crypto;
   @FXML
     private Parent root;
    @FXML
    private Stage stage;
    ObservableList<Integer> money=FXCollections.observableArrayList(100,300,600);
    ObservableList<String> currency=FXCollections.observableArrayList("BitCoin","Etherium","DorgeCoin");
    @FXML
    private Scene scene;
    Alert ex = new Alert(Alert.AlertType.WARNING, "About to log out?",ButtonType.OK);
    Alert cr = new Alert(Alert.AlertType.CONFIRMATION, "Converted cash to Crypto",ButtonType.OK);
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
       crypto.getItems().add(currency);
       amount.getItems().addAll(money);
    }
    @FXML
    void ewallet(ActionEvent event) throws IOException
    {
       root = FXMLLoader.load(getClass().getResource("e-wallet.fxml"));
       stage=(Stage)((Node)event.getSource()).getScene().getWindow();
       scene=new Scene(root);
       stage.setScene(scene);
       stage.show();
    }
    @FXML
    void exitProgram(ActionEvent event)
    {
        ex.show();
        Platform.exit();
        System.exit(0);
    }
    @FXML
    void convertMoney(ActionEvent event) throws IOException
    {
       String CRYamount=(String) crypto.getValue();
       String mon=(String)amount.getValue();
       String name=username.getText();
       File mf=new File("crypto.txt");
        mf.createNewFile();
       String url="crypto.txt";
       FileWriter mfa=new java.io.FileWriter(url,true);
        try (BufferedWriter bf = new BufferedWriter(mfa)) {
            bf.append("Crypto Currency: "+CRYamount+"\n");
            bf.append("Money Converted To crypto: M"+mon+"\n");
            bf.append("Username In Crypto: "+name+"\n");
            cr.show();
        }
    }
    @Override
    public void initialize(URL location, ResourceBundle resources) 
    {
        amount.setItems((ObservableList) money);
        crypto.setItems((ObservableList)currency);
    }
}
