package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import javax.imageio.IIOException;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;
import java.util.ResourceBundle;

public class ListUser implements Initializable {
    public static ObservableList<User> list = FXCollections.observableArrayList();

    public TableView<User> tbView = new TableView<>();

    public TableColumn<User,String> tbcFullName= new TableColumn<>();
    public TableColumn<User,String> tbcEmail= new TableColumn<>();
    public TableColumn<User,Integer> tbcAge= new TableColumn<>();
    public TableColumn<User,String> tbcAddress= new TableColumn<>();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        tbcFullName.setCellValueFactory(new PropertyValueFactory<>("fullName"));
        tbcEmail.setCellValueFactory(new PropertyValueFactory<>("email"));
        tbcAge.setCellValueFactory(new PropertyValueFactory<>("age"));
        tbcAddress.setCellValueFactory(new PropertyValueFactory<>("address"));

//        User u1= new User("Nguyen The Anh","anhthTh1999@gmail.com",19,"Soc Son, Ha Noi");
//        User u2= new User("Duy Code","duycode@gmail.com",29,"Long Bien, Ha Noi");
//
//        list.add(u1);
//        list.add(u2);

        tbView.setItems(list);
    }

    public void addUser() {
        try {
            Parent newUser = FXMLLoader.load(getClass().getResource("new-user.fxml"));
            Main.mainStage.getScene().setRoot(newUser);
        }catch (IOException e){
            System.out.println(e.getCause());
        }

    }
}
