
import java.util.Scanner;

public class Exer4 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Nhap cac phan tu cua mang: ");
       int a[]= new int[5];
       int max =0;
       for (int i = 0; i < 5; i++) {
           a[i] = sc.nextInt();
           if (i == 0) {
               max = a[i];
           }else if(a[i] > max){
            max = a[i];
           }
       }
       System.out.println("Gia tri lon nhat cua phan tu trong mang la: " +max);
    }
}   
