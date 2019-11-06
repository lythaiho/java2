package jv2_ss3;

public class Subthread1 extends MyThread {
    public void run() {
        for(int i =0; i<100;i++) {
            try {
                System.out.println(Thread.currentThread().getName()+"..."+i);
                Thread.sleep(100);
            }catch (Exception e){

            }
        }
    }
}
