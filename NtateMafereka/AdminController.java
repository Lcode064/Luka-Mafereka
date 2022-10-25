
package NtateMafereka;
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
public class AdminController {
    @FXML
    Parent rt;
    @FXML
    Stage stage;
    @FXML
    Scene scene;
    Alert ex = new Alert(Alert.AlertType.WARNING, "GoodBye",ButtonType.OK);
    @FXML
    void exitProgram(ActionEvent event)
    {
        ex.show();
        Platform.exit();
        System.exit(0);
        
    }
        @FXML
    void cryptorecords(ActionEvent event) throws FileNotFoundException, IOException
    {
       File file=new File("C:\\Users\\Lcode064\\Documents\\NetBeansProjects\\indi\\src\\NtateMafereka\\\\crypto.txt");    
        Desktop.getDesktop().print(file);
    }

    @FXML
    void ewalletrecords(ActionEvent event) throws FileNotFoundException, IOException 
    {
        File file=new File("C:\\Users\\Lcode064\\Documents\\NetBeansProjects\\indi\\src\\NtateMafereka\\\\wallet.txt");    
        Desktop.getDesktop().print(file);
    }

    @FXML
    void loginRecords(ActionEvent event) throws FileNotFoundException, IOException
    {
        File file=new File("C:\\Users\\Lcode064\\Documents\\NetBeansProjects\\indi\\src\\NtateMafereka\\\\login.txt");    
        Desktop.getDesktop().print(file);
        
    }

    @FXML
    void paidfees(ActionEvent event) throws FileNotFoundException, IOException
    {
        File file=new File("C:\\Users\\Lcode064\\Documents\\NetBeansProjects\\indi\\src\\NtateMafereka\\\\fees.txt");    
        Desktop.getDesktop().print(file);
    }

    @FXML
    void registrationrecords(ActionEvent event) throws FileNotFoundException, IOException
    {
       
        File file=new File("C:\\Users\\Lcode064\\Documents\\NetBeansProjects\\indi\\src\\NtateMafereka\\\\reg.txt");    
        Desktop.getDesktop().print(file);
    }

    @FXML
    void sendMoneyRecords(ActionEvent event) throws FileNotFoundException, IOException
    {
        File file=new File("C:\\\\Users\\\\Lcode064\\\\Documents\\\\NetBeansProjects\\\\1\\\\src\\\\pkg1\\\\sendmon.txt");    
        Desktop.getDesktop().print(file);
       

    }
   
}
