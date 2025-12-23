
import java.util.Scanner;

public class bt10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ban kinh la:");
        double r = sc.nextDouble();
        double cv = 2 * Math.PI * r;
        double dt = Math.PI * Math.pow(r,2);
        System.out.println("Chu vi la:" +cv);
        System.out.println("Dien tich la:" +dt);
    }
}
