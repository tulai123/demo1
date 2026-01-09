
import java.util.Scanner;

public class Exer4 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Nhap cac phan tu cua mang: ");
       int[] mang;
       int max =0;
       for (int i = 0; i < 5; i++) {
           mang[i] = sc.nextInt();
           if (i == 0) {
               max = mang[i];
           }else if(mang[i] > max){
            max = mang[i];
           }
       }
       System.out.println("Gia tri lon nhat cua phan tu trong mang la: " +max);
    }
}