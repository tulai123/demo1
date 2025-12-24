public class bai26_1 {
    public static void main(String[] args) {
        String s = "HEHEHEHe" + "\n hahahaha";
        System.out.println(s);

        StringBuilder chuoi = new StringBuilder();
        chuoi.append("Xin chao, ");
        chuoi.append("hello");
        System.out.println(chuoi);

        chuoi.insert(2,"Đây");
        System.out.println(chuoi);

        chuoi.delete(2, 7);
        System.out.println(chuoi);

        System.out.println(chuoi.length());

        //buổi 2
        //IndexOf: Kiểm tra vị trí xuất hiện đầu tiên của kí tự hoặc chuỗi
        //trả về -1 nếu không tìm thấy
        String s7 = "tôi tìm tôi";
        System.out.println(s7.indexOf("tìm"));

        //LastIndexOf: Trả về vị trí index xuất hiện cuối cùng của ký tự hoặc chuỗi
        //trả về -1 nếu không tìm thấy
        System.out.println(s7.lastIndexOf("tôi"));  

        //Contains : Kiểm tra chuỗi con 
        String s9 =".mp3";
        String s10 ="tuhoc.mp3";
        //Kiểm tra s10 có chứa cụm string s9 không?
        boolean check = s10.contains(s9);
        if(check)
            System.out.println("Có .mp3 trong chuỗi");
        else
            System.out.println("không thấy");

        //Substring : Trích lọc chuỗi con từ chuỗi ban đầu
        //substring(int beginIndex)
        //substring(int beginIndex, int endIndex)   
        String s11 = "abcdfgha";
        String s12 = s11.substring(4);
        System.out.println(s11);
        System.out.println(s12);
        String s13 = s11.substring(4,7);
        System.out.println(s13);

        //replace("str old", "str new")
        String s14 = "Toi bi ngu Toi";
        String s15 = s14.replace("Toi", "Bạn");
        System.out.println(s14);
        System.out.println(s15);

        //replaceFirst("str old", "str new")
        String s16 = s14.replaceFirst("Toi", "Bạn");
        System.out.println(s14);
        System.out.println(s16);

        //trim(): Xoá toàn bộ khoảng trắng ở đầu và cuối 
        String s18 = "       toi         ";
        String s19= s18.trim();
        System.out.println(s19);

        //split tách chuỗi:
        String s38 = "Hello, world";
        String[] mang =s38.split(", ");
        for (int i=0;i<mang.length;i++){
            System.out.println(mang[i]);    
        }

        //toLowerCase() && toUpperCase()    
        String s39 = "Toi Hoc tai tai";
        String s40 = s39.toLowerCase();
        System.out.println(s40);
        String s41= s39.toUpperCase();
        System.out.println(s41);

        //toCharArray() tách chuỗi thành từng kí tự, cho vào mảng
        String s42 = "asdfghjk";
        char[] mang2 = s42.toCharArray();
        //duyệt mảng
        for (int i=0;i<mang2.length;i++){
            System.out.println(mang2[i]);    
        }

        //reverse() Đảo ngược chuỗi
        String s43 = "1234567asdfg";
        //Khai báo đối tượng thuộc class StringBuilder
        StringBuilder sb = new StringBuilder(s43);
        sb.reverse();
        String s44 = sb.toString(); //chuyển sang chuỗi
        System.out.println(s44);
    }
}
