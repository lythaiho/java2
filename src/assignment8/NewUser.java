package assignment8;

import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class NewUser implements Initializable {
    public TextField newName= new TextField();
    public TextField newEmail= new TextField();
    public TextField newAge= new TextField();
    public TextArea newAddress = new TextArea();

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public void submitUser() {
        try {
            String fullName = newName.getText();
            String email =  newEmail.getText();
            Integer age;
            try{
                age = Integer.parseInt(newAge.getText());
            }catch (Exception e){
                age=0;
            }
            String address = newAddress.getText();
            User u = new User(fullName,email,age,address);
            ListUser.list.add(u);
            Parent User = FXMLLoader.load(getClass().getResource("list-user.fxml"));
            Main.mainStage.getScene().setRoot(User);
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

    }
}
