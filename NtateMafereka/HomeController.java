
package NtateMafereka;

import java.io.IOException;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class HomeController 
{
    
    @FXML
    public Label balance;

    @FXML
    public Label currentAccounts;

    @FXML
    public Label insurance;

    @FXML
    public Label netflix;

    @FXML
    public Label savings;
    @FXML
    public Parent root;
    @FXML
    public Stage stage;
    @FXML
    public Scene scene;
    @FXML
    public Label Bitcoin;
     Alert ex = new Alert(Alert.AlertType.CONFIRMATION, "INSERTED DATA",ButtonType.OK);
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
}
