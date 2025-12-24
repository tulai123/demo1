
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma sinh vien:");
        String msv = sc.nextLine();
        System.out.println("Nhap ho ten:");
        String hoTen = sc.nextLine();
        System.out.println("Nhap nam sinh:");
        int namSinh = sc.nextInt();
        int namSinhSoCuoi = namSinh % 10;
        System.out.println(msv+"_"+hoTen+"_"+namSinhSoCuoi);
    }
}