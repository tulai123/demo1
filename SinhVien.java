public class SinhVien {
    //thuộc tính(giống với biến)   
    private String hoTen;
    private double diem;

     //4.1 constructor mặc định
    //khởi tạo các giá trị mặc định
    // ngay khi đối tượng vừa được tạo ra
    // public SinhVien(){
    //     hoTen="No name";
    //     diem=0.0;
    // }
    //alt + ins
    public SinhVien() {
    }   

    //4.2 constructor có đối số
    public SinhVien(String hoTen) {
        this.hoTen = hoTen;
    }

    public SinhVien(String hoTen, double diem) {
        this.hoTen = hoTen;
        this.diem = diem;
    }

    //phương thức(các hàm)
    //phương thức không có kiểu trả về
    public void hienThiThongTin(){
        System.out.println(hoTen+" : " + diem);
    }

    //phương thức có kiểu trả về
    public double tinhDTB(double diemToan,double diemVan){
        return (diemToan+diemVan)/2;
    }
    //pt 2
    public double tinhDTB(double diemToan,double diemVan, double diemAnh){
        return (diemToan+diemVan+diemAnh)/3;
    }

    //pt 4
    public double tinhDTB(double diemToan,double diemVan, String abc){
        return (diemToan+diemVan)/2;
    }
        public double tinhDTB(String abc,double diemToan,double diemVan){
            return (diemToan+diemVan)/2;
        }
     //get,set
    public String getHoTen() {
        return hoTen;
    }

    public double getDiem() {
        return diem;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    //tostring
    @Override
    public String toString() {
        return "SinhVien [hoTen=" + hoTen + ", diem=" + diem + "]";
    }

    //Support Method và Service Method
    //Support Method
    //kiểm tra điểm khi nhập hồ sơ cho sinh viên
    private boolean checkDiem(){
        return this.diem>=1;
    }

    //Sevice Method có thể gọi từ chương trình chính
    public void checkHopLeDiem(){
        if(checkDiem())
            System.out.println("Diem hop le, tiep tuc nhap thông tin");
        else
            System.out.println("Kiem tra lai");
    }
    //parametter list
    public double tongDiem(double ... arr){
        double tong = 0.0;
        for (double x:arr){
            tong+=x;
        }
        return tong;
    }
}