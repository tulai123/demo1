
import java.util.Scanner;

public class Exer2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so nguyen a:");
        int a = sc.nextInt();
        int i = 2;
        boolean songuyento =true;
            do {
                if (a%i==0) {
                    songuyento = false;
                    break;
                }
              i++;
            } while (i<=Math.sqrt(a));
            if (songuyento) {
                System.out.println("a la so nguyen to");
            }
            else 
            System.out.println("a ko la so nguyen to");
     }
}       