
import java.util.Scanner;

public class bai26vd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao 1 chuoi: ");
        //Nhập dữ liệu gán vào biến
        String s= sc.nextLine();
        //Gán biến đếm
        int demSo=0;
        int demInThuong=0;
        int demInHoa=0;
        int demSpace=0;
        for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (Character.isLowerCase(c)){
                    demInThuong++;
                } else if(Character.isUpperCase(c)){
                    demInHoa++;
                } else if(Character.isDigit(c)){
                    demSo++;
        } else if(Character.isWhitespace(c)){
            demSpace++;

    }
}
    System.out.println("Số lượng kí tự thường: "+demInThuong);
    System.out.println("Số lượng kí tự hoa: "+demInHoa);
    System.out.println("Số lượng kí tự số: "+demSo);
    System.out.println("Số lượng kí tự khoảng trắng: "+demSpace);
}
}
