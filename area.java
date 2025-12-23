import java.util.Scanner;

public class area {

    public static int areaRectangle(int length, int width){
        return length * width;
    }

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Nhap chieu dai" );
    int length = sc.nextInt();
    System.out.println("Nhap chieu rong" );
    int width = sc.nextInt();
    int area = areaRectangle(length, width);
    System.out.println("Dien tich hinh chu nhat la " + area);
    sc.close();
    }
}
