package Connector;

import java.sql.*;

public class Connector {

    public Connection conn;

    private static Connector _instance;

    private Connector(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url= "jdbc:mysql://localhost:3306/t1904a";
            String username = "root";
            String password ="";
            conn = DriverManager.getConnection(url, username, password);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static Connector getInstance(){
        if(_instance == null){
            _instance = new Connector();
        }
        return _instance;
    }

    public ResultSet getQuery(String sql){
        try {
            PreparedStatement prstm = conn.prepareStatement(sql);
            return prstm.executeQuery();
        }catch (Exception e){}
        return null;
    }

    public boolean updateQuery(String sql){
        try{
            PreparedStatement prstm = conn.prepareStatement(sql);
            if(prstm.executeUpdate() > 0){
                return true;
            }
        }catch (Exception e){}
        return false;
    }

    public void close(){
        try {
            conn.close();
        }catch (Exception e){}
    }
}