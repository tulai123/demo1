
import java.util.Scanner;

public class bai12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so nguyen a:");
        int n = sc.nextInt();
        String traloi = (n%2 ==0)?"chan" : "Le";
        System.out.println("So" +n+ "la so" +traloi);
    }
}
