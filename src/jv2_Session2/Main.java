package jv2_Session2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Generic g1 = new Generic();
        g1.xuatKetQua(5,2);
        g1.xuatKetQua("xin chao","duy code");
        g1.xuatKetQua(3.14, 5.0);

        Generic<String> g2 =new Generic<>();
        Generic<Integer> g3 = new Generic<>();
        g1.setGName(new Object());
        g2.setGName("g2 name");
        g3.setGName(4);

        ArrayList ar1 = new ArrayList();
        ArrayList<String> ar2 = new ArrayList<>();

        //Xmen<Integer,String> x0 = new Xmen<>();

        Xmen<String,SieuNhanCap3> x1 = new Xmen<>();
        Xmen<String,SieuNhanCap1> x2 = new Xmen<>();
        Xmen<String,SieuNhanCap2> x3 = new Xmen<>();
        x3.giaitri = new SieuNhanCap2();
        x3.giaitri.bienHinh2();
        Xmen<String,SieuNhanHetThoi> x4 = new Xmen<>();

        Generic<? super SieuNhanCap2> g5 = new Generic<>();
        g5.setGName(new SieuNhanCap4());

    }
}
