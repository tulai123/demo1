public class bai17 {
    public static void main(String[] args) {
        //tính tổng 1 đến 5 bỏ qua số 3
        int tong = 0;
        for (int i = 0; i <=5; i++) {
            if(i==3)
                continue;
            else
            tong+=i;
        }
        System.out.println("tổng = "+tong);

        //break
        int n=0;
        while (n<100) { 
            System.out.println("n= "+n);
            n++;
            if (n==15) {
                break;
            }
        }
    }
}
