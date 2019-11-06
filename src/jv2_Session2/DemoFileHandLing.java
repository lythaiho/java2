package jv2_Session2;

import java.io.*;
import java.util.ArrayList;

public class DemoFileHandLing {
    public static void main(String[] args) {

        ArrayList<Student> arr = new ArrayList<>();

        File f =new File("C:/Users/lytha/OneDrive/Desktop/demo.txt");
        String ftxt ="";
        if( f.canRead()) {
            try {
                FileInputStream fis = new FileInputStream(f);
                DataInputStream dis = new DataInputStream(fis);
                String line= "";
                while ((line=dis.readLine()) != null) {
                    ftxt += line + "\n";
                    String[] strs = line.split("-");
                    Student s = new Student(strs[0],Integer.parseInt(strs[1]),
                            Integer.parseInt(strs[2]));
                    arr.add(s);
                }
//                System.out.println(dis.readLine());
            }
            catch (FileNotFoundException e) {
                System.out.println(e.getMessage());
            }
            catch (IOException e) {
                System.out.println(e.getMessage());
            }
            for (Student s:arr) {
                System.out.println("Ten : " +s.getName());
                System.out.println("Tuoi : " +s.getAge());
                System.out.println("Diem Thi : " +s.getMark());
            }

            if( f.canWrite()) {
                try {
                    FileOutputStream fos = new FileOutputStream(f);
                    DataOutputStream dos = new DataOutputStream(fos);
                    String s = "Le Ban Nam-20-4";
                    dos.writeBytes(ftxt +s);
                }catch (FileNotFoundException e) {
                    System.out.println(e.getMessage());
                }
                catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }

        }
    }
}
