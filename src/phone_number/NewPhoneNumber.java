package phone_number;

import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class NewPhoneNumber implements Initializable {
    public TextField tfPhone = new TextField();
    public TextField tfPhoneNumber = new TextField();

    public void SubmitPhoneNumber(){
        try {
            String fullName = tfPhone.getText();
            Integer PhoneNumber;
            try{
                PhoneNumber = Integer.parseInt(tfPhoneNumber.getText());
            }catch (Exception e){
                PhoneNumber=0;
            }
            PhoneNumber u = new PhoneNumber(fullName,PhoneNumber);
            ListPhoneNumber.list.add(u);
            Parent ListPhoneNumber = FXMLLoader.load(getClass().getResource("ListPhoneNumber.fxml"));
            Main.mainStage.getScene().setRoot(ListPhoneNumber);
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
