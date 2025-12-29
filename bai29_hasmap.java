import java.util.HashMap;

public class bai29_hasmap {
    public static void main(String[] args) {
        //1.Khai báo
        HashMap<Integer , String> map = new HashMap<>();
        HashMap<Integer , Float> map2 = new HashMap<>();

        //2.Thêm các phần tử vào Hasmap
        map.put(1,"haha");
        map.put(2,"huhu");
        map.put(3,"hihi");

        //3.Lấy giá trị của 1 phần tử
        String value = map.get(1);
        System.out.println(value);
        String value2 = map.get(2);
        String value3 = map.get(3);
        System.out.println(value2);
        System.out.println(value3);

        //4.Xoá phần tử khỏi Hasmap
        map.remove(2);
        System.out.println(map.get(2));

        //5.Kiểm tra xem 1 phần tử có tồn tại trong map hay không
        boolean check = map.containsKey(4);
        System.out.println(check);

        //6.Kiểm tra xem 1 giá trị có tồn tại trong map hay không
        boolean checkVL = map.containsValue("huhu");
        System.out.println(checkVL);

        //7.Kiểm tra xem Hasmap có rỗng hay không
        boolean isEmpty = map.isEmpty();
        System.out.println(isEmpty);

        //8.Lấy số lượng phần tử trong Hasmap
        int soLuongPt = map.size();
        System.out.println(soLuongPt);

        //9.Duyệt Hasmap
        for (Integer key: map.keySet()){
            String vl = map.get(key);
            System.out.println(key+" :"+vl);
        }

    }
}
