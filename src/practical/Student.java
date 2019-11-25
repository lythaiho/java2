package practical;

import java.util.Scanner;

public class Student {
    private double studentId;
    private String studentName;
    private String address;
    private double phoneNumber;

    public Student() {
    }

    public Student(double studentId, String studentName, String address, double phoneNumber) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public double getStudentId() {
        return studentId;
    }

    public void setStudentId(double studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(double phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void inputInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input ID");
        studentId= sc.nextByte();
        System.out.println("Input Student Name");
        studentName = sc.nextLine();
        System.out.println("Input Address");
        address = sc.nextLine();
        System.out.println("Input PhoneNumber");
        phoneNumber = sc.nextByte();
    }
    public void showInfo(){
        System.out.println(this.studentId);
        System.out.println(this.studentName);
        System.out.println(this.address);
        System.out.println(this.phoneNumber);
    }
}
