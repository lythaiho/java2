package jv2_ss3;


public class MyThread extends Thread {
    @Override
    public void run() {
        for(int i=0;i<20;i+=2) {
            try {
                System.out.println(Thread.currentThread().getName()+"..."+i);
                Thread.sleep(1500);
            }
            catch (Exception e){

            }
        }
    }
}
