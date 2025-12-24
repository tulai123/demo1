
import java.util.Scanner;
    
public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so nguyen a:");
        int a = sc.nextInt();
        System.out.println("Nhap so nguyen b:");
        int b = sc.nextInt();
        int Cong = a+b;
        int Tru = a-b;
        int Nhan = a*b;
        float Chia = a/b;
        System.out.println("1.Cong");
        System.out.println("2.Tru");
        System.out.println("3.Nhan");
        System.out.println("4.Chia");
        int so = sc.nextInt();
        switch (so){
            case 1:
                System.out.println(Cong);
                break;
                case 2:
                System.out.println(Tru);
                break;
                case 3:
                System.out.println(Nhan);
                break;
                case 4:
                System.out.println(Chia);
                break;
        }
        
    }
}
