package oopSXclass;

import java.util.ArrayList;
import java.util.Collections;

public class Test {
    public static void main(String[] args) {
        //tạo list
        ArrayList<SanPham> ds = new ArrayList<>();
        //khởi tạo các đối tượng sản phẩm
        SanPham sp1 = new SanPham(1, "iphone", 1050);
        SanPham sp2 = new SanPham(2, "SamSung", 1060);
        SanPham sp3 = new SanPham(3, "Oppo", 1070);
        //add sản phẩm vào list
        ds.add(sp1);
        ds.add(sp2);
        ds.add(sp3);
        //Xem ds sp trong List
        for (SanPham sp : ds)
        {
            System.out.println(sp);
        }

        //gọi pt sx
        Collections.sort(ds);
        System.out.println("Ds sau sx là: " +ds);
    }
}
