package jv2_assignment6;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;

public class ThongTinThueBao implements Initializable {
//    public TableView<ContactInfo> tbView= new TableView<>();
//    public TableColumn<ContactInfo,Integer> idContact = new TableColumn<>();
//    public TableColumn<ContactInfo,String> soDienThoai = new TableColumn<>();
//    public TableColumn<ContactInfo,String> loaiSo = new TableColumn<>();
    public ListView<ContactInfo> dienThoai= new ListView<>();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
//        idContact.setCellValueFactory(new PropertyValueFactory<>("idContact"));
//        soDienThoai.setCellValueFactory(new PropertyValueFactory<>("soDienThoai"));
//        loaiSo.setCellValueFactory(new PropertyValueFactory<>("loaiSo"));

        try{
            Class.forName("com.mysql.jdbc.Driver");
            String url= "jdbc:mysql://localhost:3306/t1904a";
            String username = "root";
            String password ="";
            Connection conn = DriverManager.getConnection(url,username,password);

            Statement stm = conn.createStatement();
            String sql = "SELECT * FROM contactinfo WHERE idContact = "+ DanhBaDienThoai.sID +";";

            ResultSet rs = stm.executeQuery(sql);
            ObservableList<ContactInfo> list = FXCollections.observableArrayList();
            while (rs.next()){
                Integer idContact = rs.getInt("idContact");
                String soDienThoai= rs.getString("soDienThoai");
                Integer loaiSo = rs.getInt("loaiSo");
                ContactInfo ctif = new ContactInfo(soDienThoai,loaiSo,idContact);
                list.add(ctif);
            }
//        tbView.setItems(list);
            dienThoai.setItems(list);

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    public void ContactList(){
        try{
            Parent form = FXMLLoader.load(getClass().getResource("DanhBa.fxml"));
            Main.mainStage.getScene().setRoot(form);
        }catch (Exception e){

        }
    }
}
