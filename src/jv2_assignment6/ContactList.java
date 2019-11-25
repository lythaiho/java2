package jv2_assignment6;

public class ContactList {
    public int id;
    public String tenNguoiDung;
    public String tenCongTy;
    public String diaChi;

    public ContactList(){

    }

    public ContactList(int id, String tenNguoiDung, String tenCongTy, String diaChi) {
        this.id = id;
        this.tenNguoiDung = tenNguoiDung;
        this.tenCongTy = tenCongTy;
        this.diaChi = diaChi;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenNguoiDung() {
        return tenNguoiDung;
    }

    public void setTenNguoiDung(String tenNguoiDung) {
        this.tenNguoiDung = tenNguoiDung;
    }

    public String getTenCongTy() {
        return tenCongTy;
    }

    public void setTenCongTy(String tenCongTy) {
        this.tenCongTy = tenCongTy;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
}
