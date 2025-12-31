package QuanLyDiem;

public class KhoaVan extends NamHoc2023 {

    public KhoaVan(String ten, int cccd) {
        super(ten, cccd);
    }

    //override
    @Override
    public void tinhDTB() {
        System.out.println("Day la pt tinh dtb cua khoa van");
    }
}