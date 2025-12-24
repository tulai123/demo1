
import java.util.Scanner;

public class bai25 {
    public static void main(String[] args) {
        char ch = 'a';
        char ch2 = 66;
        System.out.println(ch2);
        char ch3;
        Scanner sc = new Scanner(System.in);
        System.out.println("MOi nhap 1 ki tu: ");
        String s = sc.nextLine();
        char ch4 =s.charAt(0);
        System.out.println("ky tu nhap: " +ch4);
        //so sánh
        System.out.println(Character.compare('b', 'b'));
        System.out.println(Character.compare('a', 'b'));
        System.out.println(Character.compare('A', 'a'));

        char ch5 ='1';
        char ch6 ='A';
        char ch7 ='a';

        System.out.println(Character.isDigit(ch5));
        System.out.println(Character.isLetter(ch6));
        System.out.println(Character.isLowerCase(ch6));
        System.out.println(Character.isUpperCase(ch7));
    }
}
