package jv2_ss3;

public class Main {
    public static void main(String[] args) {
        MyThread m1 = new MyThread();
        System.out.println(m1.getName());
        m1.setName("My Thread");
        m1.start();

        Subthread2 s2 = new Subthread2();
        Thread t1 = new Thread(s2);
        t1.start();

        Runnable r1 = ()->{
          System.out.println("Lambda expression");
        };
        Thread t2 = new Thread(r1);
        t2.start();

        Runnable r2 = new Runnable() {
            @Override
            public void run() {
                System.out.println("no Lambda expression");
            }
        };
    }
}
