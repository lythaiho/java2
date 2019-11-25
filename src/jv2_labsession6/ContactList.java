package jv2_labsession6;

import Connector.Connector;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.ListView;

import java.net.URL;
import java.sql.ResultSet;
import java.util.ResourceBundle;

public class ContactList implements Initializable {

    public ListView<Contact> listView = new ListView<>();

    public static Contact detail;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        try {
            Connector connector = Connector.getInstance();
            String sql = "SELECT * FROM contact";
            ResultSet rs = connector.getQuery(sql);

            ObservableList<Contact> list  = FXCollections.observableArrayList();

            while (rs.next()){
                Integer id = rs.getInt("id");
                String contact_name = rs.getString("contact_name");
                String company = rs.getString("company");
                String address = rs.getString("address");
                Contact c = new Contact(id,contact_name,company,address);
                list.add(c);
            }
            listView.setItems(list);

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public void viewContact(){
        detail = listView.getSelectionModel().getSelectedItem();
        try {
            Parent view = FXMLLoader.load(getClass().getResource("detail.fxml"));
            Main.mainStage.getScene().setRoot(view);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}