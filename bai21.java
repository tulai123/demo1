public class bai21 {
    public static void main(String[] args) {
        int kq = Cong(1, 2, 3);
        System.out.println("Tong cac so la: " +kq);
        //goi ham xin chao
         XinChao("male");
         XinChao("female");
    }

    public static int Cong(int x,int i,int z){
        System.out.println(x);
        System.out.println(i);
        System.out.println(z);
        return x+i+z;
    }

    //Ham thu tuc
    public static void XinChao(String gioitinh){
        if (gioitinh.equals("female"))
            System.out.println("Nhan vien nu");
        else if (gioitinh.equals("male"))
            System.out.println("Nhan vien nam");
    }
}
