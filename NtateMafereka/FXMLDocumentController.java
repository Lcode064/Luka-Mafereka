
package NtateMafereka;

import java.io.File;
import java.sql.*;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.scene.control.Label;
import java.io.FileWriter;
public class FXMLDocumentController implements Initializable
{
    @FXML
    private TextField email;
    @FXML
    private PasswordField password;
    @FXML
    private Parent root;
    @FXML
    private Parent rt;
    @FXML
    private Stage stage;
    @FXML
    private Label notData;
    @FXML
    
    private Scene scene;
     Alert a1 = new Alert(AlertType.INFORMATION, "Not registered, Your Being send to registration Page!",ButtonType.OK);

     
    @FXML
    public void validate(ActionEvent event) throws ClassNotFoundException, IOException, SQLException 
    {
        try
        {
        String Email=email.getText();
        String secret=password.getText(); 
        
        if("admin".equals(Email)&&"1234".equals(secret))
            {
                    root = FXMLLoader.load(getClass().getResource("admin.fxml")); 
                    stage=(Stage)((Node)event.getSource()).getScene().getWindow();
                    scene=new Scene(root);
                    stage.setScene(scene);
                    stage.show();
               
              }
        else
            if(Email.isEmpty()||secret.isEmpty())
            {
                notData.setText("Cannot be Empty");
            }
            else
            {
                File mf=new File("login.txt");
                mf.createNewFile();
            try (FileWriter insert = new FileWriter("login.txt",true)) {
                insert.append(Email+" : "+secret+"\n");
                insert.close();
            }
                    a1.show();
                    root = FXMLLoader.load(getClass().getResource("register.fxml")); 
                    stage=(Stage)((Node)event.getSource()).getScene().getWindow();
                    scene=new Scene(root);
                    stage.setScene(scene);
                    stage.show();
                
            }
                    }
         catch(IOException | NumberFormatException ex)
         {
             System.out.println("Error: "+ex);
         }
    }
    @Override
    public void initialize(URL location, ResourceBundle resources) {
         
    }
     
    
}
