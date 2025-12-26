
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma sinh vien:");
        String msv = sc.nextLine();
        System.out.println("Nhap ho ten:");
        String hoTen = sc.nextLine();
        String hoTenKC = hoTen.replace(" ", "");
        System.out.println("Nhap nam sinh:");
        int namSinh = sc.nextInt();
        int namSinhSoCuoi = namSinh % 10;
        String a = String.join("_", msv, hoTenKC, String.valueOf(namSinhSoCuoi));
        System.out.println(a);
    }
}