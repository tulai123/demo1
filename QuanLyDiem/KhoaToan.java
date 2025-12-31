package QuanLyDiem;

public class KhoaToan extends NamHoc2023 {

    public KhoaToan(String ten, int cccd) {
        super(ten, cccd);
    }

    //override
    @Override
    public void tinhDTB() {
        System.out.println("Day la pt tinh dtb cua khoa toan");
    }

    
}
