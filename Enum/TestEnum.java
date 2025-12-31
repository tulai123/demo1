package Enum;

import java.util.ArrayList;

public class TestEnum {
    public static void main(String[] args) {
        //kiểm tra thứ tự các giá trị trong enum
        System.out.println(XepLoai.kha.ordinal());
        System.out.println(XepLoai.yeu.ordinal());
        //tạo lst danh sách
        ArrayList<SV> ds = new ArrayList<>();
        //tạo đối tượng sinh viên
        SV sv1 = new SV(1,"Mot",9.5);
        SV sv2 = new SV(2,"Hai",1.5);
        SV sv3 = new SV(3,"Ba",6.5);
        //add các sinh viên vào ds list
        ds.add(sv1);
        ds.add(sv2);
        ds.add(sv3);
        //duyệt danh sách
        for(SV ttSinhVien: ds){
            System.out.println(ttSinhVien);
        }
    }
}
