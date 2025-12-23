
import java.util.Scanner;

public class bt12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap dtb:");
        double dtb = sc.nextDouble();

        String traloi = (dtb>=8 && dtb<10)?"Gioi":
            ((dtb<8 && dtb>=6.5)? "Kha":
            (dtb<6.5 && dtb>=5)?"Trung binh" :"Yeu");
            System.out.println(traloi);
    }
}
