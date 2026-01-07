
import java.util.Scanner;

public class Exer3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chuoi a");
        String a = sc.nextLine();
        String daoNguoc = new StringBuilder(a).reverse().toString();
        System.out.println("Chuoi dao nguoc la:" +daoNguoc);
     }
}

