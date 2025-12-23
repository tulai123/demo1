
import java.util.Scanner;

public class bai11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap dtb:");
        double dtb =sc.nextDouble();

        if(dtb>=8.0 && dtb<10){
            System.out.println("Ban gioi");
        }

        else if (dtb>=7 && dtb<8){
            System.out.println("ban kha");
        }
        else {
            System.out.println("ban trung binh");
        }
    }
}
