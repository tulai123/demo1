
import java.util.Scanner;
public class Exer1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so nguyen N:");
        int N = sc.nextInt();
        int tong = 0;
        for(int i = 0; i <= N; i++){
            if(i%2!=0)
                continue;
            else
                tong+=i;
            }
            System.out.println("tong =" + tong);
    }
}