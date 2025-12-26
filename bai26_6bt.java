public class bai26_6bt {
    public static void main(String[] args) {
        
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
