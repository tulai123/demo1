
import java.util.Scanner;

public class bai131 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi bam phim de chon:");
        System.out.println("1.Ten");
        System.out.println("2.Tac gia");
        System.out.println("3.NXB");
        System.out.println("4.Tieu de");
        int so = sc.nextInt();
        switch (so){
            case 1:
                System.out.println("theo ten");
                break;
                case 2:
                    System.out.println("theo tac gia");
                    break;
                    case 3:
                        System.out.println("theo NXB");
                        break;
                        case 4:
                            System.out.println("theo tieu de");
                            break;
                default:
                    System.out.println("Ko hop le");
                    break;
        }

    }
}
