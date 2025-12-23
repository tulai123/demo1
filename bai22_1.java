import java.util.Calendar;
import java.util.Scanner;

public class bai22_1 {
    
    public static void main(String[] args) {
        int day, month, year, tuoi;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap ngay sinh:");
        day = input.nextInt();
        System.out.println("Nhap thang sinh:");
        month = input.nextInt();
        System.out.println("Nhap nam sinh:");
        year = input.nextInt();

        Calendar birthday = Calendar.getInstance();
        birthday.set(year,month-1,day);
        int namSinh = birthday.get(Calendar.YEAR);
        int thangSinh = birthday.get(Calendar.MONTH);
        int ngaySinh = birthday.get(Calendar.DAY_OF_MONTH);

        System.out.println("ngay thang nam: " +ngaySinh+ "/" +(thangSinh+1)+ "/" +namSinh);

        Calendar now = Calendar.getInstance();
        int namHienTai = now.get(Calendar.YEAR);
        tuoi = namHienTai-namSinh;
        System.out.println("Tuoi ban la: " +tuoi);
    }   
}


//Nhập từ bàn phím chiều dài, chiều rộng. có 1 hàm để tính diện tích hình chữ nhật