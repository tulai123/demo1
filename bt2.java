import java.util.Scanner;
public class bt2 {
    public static void main(String[] args) {
       Scanner sc = new  Scanner(System.in);
       System.out.println("Chieu dai la:");
       double a = sc.nextDouble();
       System.out.println("Chieu rong la:");
       double b = sc.nextDouble();
       double s = a*b;
       double p = (a+b) *2;
       System.out.println("Dien tich la:" +s);
       System.out.println("Chu vi la:" +p);
    }
}
