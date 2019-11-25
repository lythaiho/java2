package practical;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class ListStudent {
    public ArrayList<Student> ListSv;
    public ListStudent(){
        ListSv= new ArrayList<>();
    }
    public void addStudent(Student s){
        ListSv.add(s);
    }
    public void displayStudent(Student s){
        System.out.println(s.getStudentId());
        System.out.println(s.getStudentName());
        System.out.println(s.getAddress());
        System.out.println(s.getPhoneNumber());

    }

    public void saveStudent(){
        ArrayList<Student> arr = new ArrayList<>();
        File f =new File("C:/Users/lytha/OneDrive/Desktop/demo.txt");
        String content = "";
        for (Student s : this.ListSv) {
            content += s.getStudentId() + ", " + s.getStudentName() + ", " + s.getAddress() + ", " + s.getPhoneNumber() + "\n";
        }
        try (FileOutputStream fop = new FileOutputStream(f)) {

            // if file doesn't exists, then create it
            if (!f.exists()) {
                f.createNewFile();
            }

            // get the content in bytes
            byte[] contentInBytes = content.getBytes();

            fop.write(contentInBytes);
            fop.flush();
            fop.close();

            System.out.println("Done");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
