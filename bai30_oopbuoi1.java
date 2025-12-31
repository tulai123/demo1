public class bai30_oopbuoi1 {
    public static void main(String[] args) {
        //khởi tạo đối tượng thuộc class SinhVien
        SinhVien sv1 = new SinhVien();
        SinhVien sv2 = new SinhVien();
        sv1.hienThiThongTin();
        sv2.hienThiThongTin();

        SinhVien sv3 = new SinhVien("Huy");
        sv3.hienThiThongTin();

        SinhVien sv4 = new SinhVien("Tú",9.5);
        sv4.hienThiThongTin();

        System.out.println(sv4.getHoTen());
        System.out.println(sv4.getDiem());
        //Thay đổi tên sinh viên 4
        sv4.setHoTen("Tèo");
        sv4.setDiem(3);
        sv4.hienThiThongTin();

        //Test phương thức có kiểu trả về
        double dtbsv4 = sv4.tinhDTB(7, 8);
        System.out.println(dtbsv4);

        //test phương thức tostring
        System.out.println(sv4);
        
        //Support Method và Service Method
        sv4.checkHopLeDiem();

        //overloading
     double testD =sv4.tinhDTB(5, 6, 5);
     System.out.println(testD);
     double testD2 =sv4.tinhDTB(8, 9);
     System.out.println(testD2);

       //parametter list
    double kq =sv4.tongDiem(1,2,3,5,6,7,8,3,4);
    System.out.println(kq);
    }
}