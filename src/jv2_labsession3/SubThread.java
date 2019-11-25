package jv2_labsession3;

public class SubThread implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i <= 600; i++) {
            try{
                int m = (600-i)/60;
                int s = (600-i)%60;
                System.out.println(String.format("%02d",m)+":"+String.format("%02d",s));
                Thread.sleep(10);
            }
            catch (Exception ignored){}
        }
        System.out.println("The end");
    }
}