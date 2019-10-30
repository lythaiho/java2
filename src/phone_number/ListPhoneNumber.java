package phone_number;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;
import java.net.URL;
import java.util.Collections;
import java.util.ResourceBundle;

public class ListPhoneNumber implements Initializable {
    public static ObservableList<PhoneNumber> list = FXCollections.observableArrayList();
    public TableView<PhoneNumber> tbView = new TableView<>();
    public TableColumn<PhoneNumber,String> tcName = new TableColumn<>();
    public TableColumn<PhoneNumber,Integer> tcPhoneNumber = new TableColumn<>();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        tcName.setCellValueFactory(new PropertyValueFactory<>("name"));
        tcPhoneNumber.setCellValueFactory(new PropertyValueFactory<>("number"));
        tbView.setItems(list);
    }

    public void addPhoneNumber() {
        try {
            Parent newPhoneNumber = FXMLLoader.load(getClass().getResource("AddPhoneNumber.fxml"));
            Main.mainStage.getScene().setRoot(newPhoneNumber);
        }catch (IOException e){
            System.out.println(e.getCause());
        }

    }

    public void sortAZ(){
        Collections.sort(list, (PhoneNumber u1, PhoneNumber u2) -> u1.getName().compareTo(u2.getName()));
    }

    public void sortZA(){
        Collections.sort(list, (PhoneNumber u1, PhoneNumber u2) -> -u1.getName().compareTo(u2.getName()));
    }
}
