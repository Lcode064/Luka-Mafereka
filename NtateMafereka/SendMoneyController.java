
package NtateMafereka;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.sql.*;
import java.io.FileWriter;
public class SendMoneyController implements Initializable
{
    @FXML
    private TextField accountNo;

    @FXML
    private TextField amount;

    @FXML
    private Label balance;
    
    @FXML
    private Label debited;
    @FXML
    private Label ref;
    @FXML
    private Label deduct;
    @FXML
    private TextField reference;
    @FXML
     private Parent root;
    @FXML
    private Stage stage;
    @FXML
    private Scene scene;
 
    @FXML
   
      Alert ex = new Alert(Alert.AlertType.CONFIRMATION, "Transaction Successful",ButtonType.OK);
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
    void sendMoney(ActionEvent event) throws IOException, SQLException
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
        ex.show();
        Platform.exit();
        System.exit(0);
    }
    @FXML
    void perfomTransaction(ActionEvent event) throws IOException
    { 
        File mf=new File("sendmon.txt");
        mf.createNewFile();
        FileWriter myFile=new FileWriter("sendmon.txt",true);
         
         String Reference=reference.getText();
         String Money=amount.getText();
         String account=accountNo.getText();
         
     
            try (BufferedWriter bf = new BufferedWriter(myFile)) {
            
            bf.append("Amount debited: M"+Money+"\n");
            bf.append("Account Number: "+account+"\n");
            bf.append("Send By: "+Reference+"\n");
            ex.show();
            bf.close();
        }
    }
    @Override
    public void initialize(URL location, ResourceBundle resources)
    {
       
    }
    
}
