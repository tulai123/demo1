package QuanLyDiem;

public class NamHoc2023 {
    //thuộc tính
    protected String ten;
    protected int cccd;
    //alt ins
    public NamHoc2023(String ten, int cccd) {
        this.ten = ten;
        this.cccd = cccd;
    }

    //phương thức
    public void tinhDTB(){
        System.out.println("Day la pt tinh dtb của class cha");
    }
}
