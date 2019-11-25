package jv2_assignment6;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;

public class DanhBaDienThoai implements Initializable {
//    public TableView<ContactList> tbView = new TableView<>();
//    public TableColumn<ContactList,Integer> id = new TableColumn<>();
//    public TableColumn<ContactList,String> tenNguoiDung = new TableColumn<>();
//    public TableColumn<ContactList,String> tenCongTy = new TableColumn<>();
//    public TableColumn<ContactList,String> diaChi = new TableColumn<>();

    public ListView<ContactList> danhBa = new ListView<>();
        public static int sID;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
//        id.setCellValueFactory(new PropertyValueFactory<>("id"));
//        tenNguoiDung.setCellValueFactory(new PropertyValueFactory<>("tenNguoiDung"));
//        tenCongTy.setCellValueFactory(new PropertyValueFactory<>("tenCongTy"));
//        diaChi.setCellValueFactory(new PropertyValueFactory<>("diaChi"));

//        try{
//            Class.forName("com.mysql.jdbc.Driver");
//            String url= "jdbc:mysql://localhost:3306/t1904a";
//            String username = "root";
//            String password ="";
//            Connection conn = DriverManager.getConnection(url,username,password);
//
//            Statement stm = conn.createStatement();
//            String sql = "SELECT * FROM contactlist";
//            ResultSet rs = stm.executeQuery(sql);
//
//            ObservableList<ContactList> list = FXCollections.observableArrayList();
//            while (rs.next()){
//                Integer id = rs.getInt("id");
//                String tenNguoiDung = rs.getString("tenNguoiDung");
//                String tenCongTy = rs.getString("tenCongTy");
//                String diaChi = rs.getString("diaChi");
//                ContactList ctl = new ContactList(id,tenNguoiDung,tenCongTy,diaChi);
//                list.add(ctl);
//            }
//            tbView.setItems(list);
//
//        }catch (Exception e){
//            System.out.println(e.getMessage());
//        }
        this.danhBa1();
    }
    public void ContactInfo(){
        try{
            Parent form = FXMLLoader.load(getClass().getResource("ContactInfo.fxml"));
            Main.mainStage.getScene().setRoot(form);
        }catch (Exception e){

        }
    }
    public void danhBa1(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url= "jdbc:mysql://localhost:3306/t1904a";
            String username = "root";
            String password ="";
            Connection conn = DriverManager.getConnection(url,username,password);

            Statement stm = conn.createStatement();
            String sql = "SELECT * FROM contactlist";
            ResultSet rs = stm.executeQuery(sql);

            ObservableList<ContactList> list = FXCollections.observableArrayList();
            while (rs.next()){
                Integer id = rs.getInt("id");
                String tenNguoiDung = rs.getString("tenNguoiDung");
                String tenCongTy = rs.getString("tenCongTy");
                String diaChi = rs.getString("diaChi");
                ContactList ctl = new ContactList(id,tenNguoiDung,tenCongTy,diaChi);
                list.add(ctl);
            }
            danhBa.setItems(list);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    public void findContact(){
        try{
            sID = danhBa.getSelectionModel().getSelectedItem().getId();
            Parent number = FXMLLoader.load(getClass().getResource("DIenThoai.fxml"));

            Main.mainStage.getScene().setRoot(number);
        } catch(Exception e){
            System.out.println("Error!");
        }
    }
}
