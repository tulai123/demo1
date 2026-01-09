
import java.util.Scanner;

public class Exer5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so nguyen N:");
        long N = sc.nextLong();
        long giaithuaN = 1;
        long a = 1;
        do {
            giaithuaN*=a;
            a++;
        } while (a<=N);
        System.out.println("!"+N+"=" +giaithuaN);
    }
}