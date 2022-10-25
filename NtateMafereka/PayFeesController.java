
package NtateMafereka;

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
import javafx.stage.Stage;
import java.sql.*;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.File;
public class PayFeesController implements Initializable
{
    
    @FXML
    private ComboBox amount;

    @FXML
    private Label balance;

    @FXML
    private ComboBox company;

    @FXML
    private ComboBox service;
     ObservableList<String> money=FXCollections.observableArrayList("M100","M300","M600");
     ObservableList<String> offer=FXCollections.observableArrayList("Alliance Insuraance","WASCO Lesotho","LEC");
     ObservableList<String> offered=FXCollections.observableArrayList("Pay for insurance","Pay for water Bills","Buy Electricity");
    @FXML
     private Parent root;
    @FXML
    private Stage stage;
    @FXML
    private Scene scene;
    @FXML
    private Label username;
     Alert a1 = new Alert(Alert.AlertType.NONE, "INSERTED DATA",ButtonType.OK);
     Alert ad = new Alert(Alert.AlertType.INFORMATION, "Paid Fees successfully",ButtonType.OK); 
    @FXML
    void profile(ActionEvent event) throws IOException {
       root = FXMLLoader.load(getClass().getResource("home.fxml"));
       stage=(Stage)((Node)event.getSource()).getScene().getWindow();
       scene=new Scene(root);
       stage.setScene(scene);
       stage.show();
    }
    @FXML
    void pay(ActionEvent event) throws IOException, SQLException
    {
        amount.getItems().addAll(money);
        company.getItems().addAll(offer);
        service.getItems().addAll(offered);
        
    }
    @FXML
    void fees(ActionEvent event) throws IOException
    {
        String Money=(String) amount.getValue();
        String Company=(String) company.getValue();
        String Service=(String) service.getValue();
        File mf=new File("fees.txt");
        mf.createNewFile();
        String url="fees.txt";
        FileWriter mfa=new FileWriter(url,true);
        try (BufferedWriter bf = new BufferedWriter(mfa)) {
            bf.append("Premium: "+Money+"\n");
            bf.append("Company: "+Company+"\n");
            bf.append("Service provided: "+Service+"\n");
            ad.show();
        }
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
        Platform.exit();
        System.exit(0);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources)
    {
        amount.setItems((ObservableList) money);
        company.setItems((ObservableList)offer);
        service.setItems((ObservableList)offered);
    }
}
