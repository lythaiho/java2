package jv2_session5;
import java.sql.*;
public class Main {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url= "jdbc:mysql://localhost:3306/t1904a";
            String username = "root";
            String password ="";
            Connection conn = DriverManager.getConnection(url,username,password);

            Statement stm = conn.createStatement();

            String ins_sql ="INSERT INTO student(student_name,age,mark) VALUES('Ngo Van Duy',18,2);";
            stm.executeUpdate(ins_sql);

            String sql = "SELECT * FROM student";

            ResultSet rs = stm.executeQuery(sql);

            while (rs.next()) {
                System.out.println(rs.getInt("id"));
                System.out.println(rs.getString("student_name"));
                System.out.println(rs.getInt("age"));
                System.out.println(rs.getInt("mark"));


            }

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
