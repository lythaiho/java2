package jv2_Session2;

import sun.awt.geom.AreaOp;

public class Generic<E> {

    public E gName;

    public E getGName() {
        return gName;
    }

    public void setGName(E gName) {
        this.gName = gName;
    }

    public <T> void xuatKetQua(T x, T y ) {
        if (x instanceof Integer) {
            int a = (Integer)x;
            int b= (Integer)y;// ép kiểu
            System.out.println(a+b);
//            System.out.println((Integer) x +(Integer) y);
        }
        else if (x instanceof Double) {
            double a =(Double)x;
            double b =(Double)y;// ép kiểu
            System.out.println(a+b);
//            System.out.println((Double) x + (Double) y);
        }
        else {
            System.out.println(x.toString() + y.toString());

        }
    }
}
