
import java.util.Scanner;

public class bai26_6bt {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String password = "";
       //1.Mời thiết lập mk và kiểm tra tính hợp lệ
       while (true) { 
           //Nhập mk mới cho ng dùng
           System.out.println("Mời thiết lập mk");
           System.out.println("Mk ít nhất 6 kí tự,1 chữ cái,1 số");
           String newPassword = sc.nextLine();
           //kiểm tra tính hợp lệ mk mới
           if (checkMK(newPassword)) {
               password=newPassword;
               System.out.println("Mk đã đc thiết lập");
               break;
           }
           else
            System.out.println("Mk ko hợp lệ");

           //2. Cho người dùng nhập mk để login
           //Số lần người dùng nhập sai mk
           int count = 0;
           String login = "";
           while (true) { 
            //Nhập mk từ ng dùng
            System.out.println("Mời nhập mk để login");
            login = sc.nextLine();
            //Kiểm tra mk có khớp ko
            if (login.equals(password)){
                System.out.println("Đn thành công");
            }
            else{
                System.out.println("MK ko hợp lệ"+(5-count) +"lần thử");
                count++;
            }
            //nếu đếm=5 thoát chương trình
            if (count==5)
            {
                System.out.println("Bạn đã nhập sai quá 5 lần");
                break;
            }
           }
       }
    }
    //hàm kiểm tra tính hợp lệ của mk
    public static boolean checkMK (String password){
        //kiểm tra độ dài    
        if (password.length()<6)
            return false;

        //kiểm tra mk có chứa ít nhất 1 chữ cái hay không
        boolean hasLetter =false;
        for(char c : password.toCharArray()){
            if(Character.isLetter(c)){
                hasLetter = true;
                break;
            }
        }
        if (hasLetter==false)
            return false;

        //Kiểm tra mk có chứa ít nhất 1 chữ số hay ko
        boolean hasNumber =false;
        for(char c : password.toCharArray()){
            if(Character.isDigit(c)){
                hasNumber = true;
                break;
            }
            if (!hasNumber)
                return false;
            //nếu mk đủ dài, chứa ít nhất 1 chữ cái và ít nhất 1 chữ số, trả về true
            return true;
        }
                return hasNumber;
    }
}