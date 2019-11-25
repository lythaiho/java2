package practical;

import java.util.Scanner;

import static java.awt.SystemColor.menu;

public class Main {
    public static void main(String[] args) {
        int sl;
        ListStudent l= new ListStudent();
        while (true){
            Scanner sc = new Scanner(System.in);
            menu();
            sl = sc.nextInt();
            switch (sl){
                case 1:{
                    Student sv = new Student();
                    sv.inputInfo();
                    l.addStudent(sv);
                    break;
                }
                case 2: {
                    Student sv = new Student();
                    for (int i=0 ; i<l.ListSv.size();++i){
                        l.displayStudent(sv);
                    }
                    break;
                }
                case 3: {
                    l.saveStudent();
                    break;
                }

            }

        }

    }
    public static void menu() {
        System.out.println("-----Menu----");
        System.out.println("1. Add student.");
        System.out.println("2. show student.");
        System.out.println("3. Save student.");
        System.out.println("4. Exit.");

    }
}