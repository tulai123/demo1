package QuanLyDiem;

public class TestDiem {
    public static void main(String[] args) {
        //khởi tạo đối tượng
        KhoaToan toan1 = new KhoaToan("NVA", 6666);
        toan1.tinhDTB();

        KhoaVan van1 = new KhoaVan("NVB", 8888);
        van1.tinhDTB();
    }
}