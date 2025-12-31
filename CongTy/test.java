package CongTy;

public class test {
    public static void main(String[] args) {
    //     NhanVien nv1 = new NhanVien("nhan vien 1", "Hà Nội", 123456);
    //    double luongnv1 =  nv1.tinhLuong();
    //    System.out.println("Lương nv1 là :" +luongnv1);

       //tạo đối tượng là nv hành chính
       NhanVienHanhChinh hc1 = new NhanVienHanhChinh("HC1", "HN", 1234);
       double luonghc1 =  hc1.tinhLuong();
       System.out.println("Lương hc1 là :" +luonghc1);

       //tạo đối tượng là nv Đi Ca
       NhanVienDiCa dc1 = new NhanVienDiCa("Dc1", "HN1", 123333);
       double luongdc1 =  dc1.tinhLuong();
       System.out.println("Lương dc1 là :" +luongdc1);

       NhanVienDiCa ca2 = new NhanVienDiCa("ca2", "BN", 123440, 1);
       double ca2luong = ca2.tinhLuong();
       System.out.println("Lương ca 2 là :" +ca2luong);
       System.out.println(ca2.ca);
    }
}
