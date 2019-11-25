package jv2_labss4;

public class BankAccount {
    public  int account =0;

    public synchronized  void moTaiKhoan(){
        account =10;
        System.out.println("Mo tai khoan thanh cong");
        try {
            notifyAll();
        }catch (Exception e){

        }
    }

    public synchronized void napTien(){
        if(account ==0){
            try {
                wait();
            }catch (Exception e){

            }
        }
        System.out.println("Nap tien vao tai khoan: "+account);
    }

    public synchronized void doiMatKhau(){
        System.out.println("Doi mat khau cho tai khoan:"+account);
        if(account ==0){
            try {
                wait();
            }catch (Exception e){

            }
        }
    }

    public synchronized void lamTheATM() {
        System.out.println("Lam ATM cho tai khoan: "+account);
        if(account ==0){
            try {
                wait();
            }catch (Exception e){

            }
        }
    }
}
