
import java.util.Scanner;

public class bai14vd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap 1 so nguyen 1-99:");
        int n = sc.nextInt();
        while (n<1 || n>99){
            System.out.println("Nhap lai n sai dieu kien");
            n= sc.nextInt();
        }
        System.out.println("Ban da nhap xong n =" +n);
    }
}
