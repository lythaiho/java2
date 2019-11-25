package jv2_assignment6;

public class ContactInfo {
    public String soDienThoai;
    public int loaiSo;
    public int idContact;

    public ContactInfo(){

    }

    public ContactInfo(String soDienThoai, int loaiSo, int idContact) {
        this.soDienThoai = soDienThoai;
        this.loaiSo = loaiSo;
        this.idContact = idContact;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public int getLoaiSo() {
        return loaiSo;
    }

    public void setLoaiSo(int loaiSo) {
        this.loaiSo = loaiSo;
    }

    public int getIdContact() {
        return idContact;
    }

    public void setIdContact(int idContact) {
        this.idContact = idContact;
    }

    @Override
    public String toString() {
        return "ContactInfo{" +
                "soDienThoai='" + soDienThoai + '\'' +
                ", loaiSo=" + loaiSo +
                ", idContact=" + idContact +
                '}';
    }
}
