public class bai26_5giaibtjava19 {
    public static void main(String[] args) {
        String str1="English = 78 Science = 83 Math = 68 History = 65";
        int sum=0; //biến tính tổng
        int count=0;//biến lưu số lượng số
        //Tách chuỗi thành các thành phần bằng cách sử dụng phương thức split() của lớp String
        String[] parts = str1.split("");
        //Duyệt qua từng phần và chuyển nó sang kiểu số nếu có thể
        for(String pt : parts){
            System.out.println(pt);
            try {
                //Chuyển chuỗi sang số nguyên bằng phương thức parseInt() của lớp Integer
                int num = Integer.parseInt(pt);
                sum+=num; //cộng thêm số 
                count++;
            } catch (NumberFormatException e) {
                //chỉ đơn giản là không làm gì cả
            }
        }
        //tính trung bình cộng 
        double tbc = (double) sum/count;
        System.out.println("Tổng các số trong chuỗi là: "+sum);
        System.out.println("TBC các số trong chuỗi là : "+tbc);
    }
}
