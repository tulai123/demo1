package TinhDaHinh;

public class Test {
    public static void main(String[] args) {
        NhanSu ns1 = new PhoPhong("hhihi","525252","HN");
        //Xuất lương phó phòng
        System.out.println(ns1.tinhLuong(21));
        System.out.println("Luc ns1 dang lm pp");
        System.out.println(ns1.getTen()+":" + ns1.getCccd());
        //thay đổi chức vụ
        ns1 = new TruongPhong(ns1.getTen(),ns1.getCccd(),ns1.getQue());
        //in lương ns1 khi làm tp
        System.out.println("Luc ns1 dang lm tp");
        System.out.println(ns1.getTen()+":" + ns1.getCccd());
        System.out.println(ns1.tinhLuong(21));
    }
}
