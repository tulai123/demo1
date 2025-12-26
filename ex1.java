
import java.util.Scanner;
    
public class ex1 {
    public static int Cong(int a, int b){
        return a+b;
    }
    public static int Tru(int a, int b){
        return a-b;
    }
    public static int Nhan(int a, int b){
        return a*b;
    }
    public static float  Chia(int a, int b){
        return a*b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so nguyen a:");
        int a = sc.nextInt();
        System.out.println("Nhap so nguyen b:");
        int b = sc.nextInt();
        System.out.println("1.Cong");
        System.out.println("2.Tru");
        System.out.println("3.Nhan");
        System.out.println("4.Chia");
        int so = sc.nextInt();
        switch (so){
            case 1:
                System.out.println(Cong(a, b));
                break;
                case 2:
                System.out.println(Tru(a, b));
                break;
                case 3:
                System.out.println(Nhan(a, b));
                break;
                case 4:
                System.out.println(Chia(a, b));
                break;
        }
    }
}
