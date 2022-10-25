
package NtateMafereka;
import java.io.*;
import java.io.FileWriter;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
public class RegistrationController
{
    @FXML
    private TextField Email;

    @FXML
    private TextField fsname;

    @FXML
    private TextField id;

    @FXML
    private TextField job;

    @FXML
    private TextField lname;

    @FXML
    private TextField stay;
    @FXML
    private Label fillout;
    @FXML
    private RadioButton female;
    @FXML
    private RadioButton male;
    @FXML
    private Parent root;
    @FXML
    private Stage stage;
    @FXML
    private Scene scene;
    String gender=null;
    @FXML
    Alert cr = new Alert(Alert.AlertType.INFORMATION, "Successfully Registered",ButtonType.OK);
    @FXML
    void profile(ActionEvent event) throws IOException 
    {
      String name=fsname.getText();
      if(male.isSelected())
      {
          gender="male";
      }
      else if(female.isSelected())
      {
          gender="female";
      }
      String Surname=lname.getText();
      String Address=stay.getText();
      String ID=id.getText();
      String JobTitle=job.getText();
      File mf=new File("reg.txt");
      mf.createNewFile();
      FileWriter mfa=new FileWriter("reg.txt");
        try (BufferedWriter bf = new BufferedWriter(mfa)) {
            bf.append("Name: "+name+"\n");
            
            bf.append("Last Name: "+Surname+"\n");
            bf.append("Sddress: "+Address+"\n");
            bf.append("Gender: "+gender+"\n");
            bf.append("Id Number: "+ID+"\n");
            bf.append("Job Title"+JobTitle+"\n");
            cr.show();
        }
      root = FXMLLoader.load(getClass().getResource("home.fxml"));
      stage=(Stage)((Node)event.getSource()).getScene().getWindow();
      scene=new Scene(root);
      stage.setScene(scene);
      stage.show();
      
    } 
   
}