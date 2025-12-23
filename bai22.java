
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class bai22 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        System.out.println(cal);
        int nam = cal.get(Calendar.YEAR);
        int thang = cal.get(Calendar.MONTH);
        int ngay = cal.get(Calendar.DAY_OF_MONTH);
        System.out.println(nam);
        System.out.println(thang+1);
        System.out.println(ngay);

        cal.set(Calendar.YEAR,2005);
        cal.set(Calendar.MONTH,9);
        cal.set(Calendar.DAY_OF_MONTH,19);

        int namSinh = cal.get(Calendar.YEAR);
        int thangSinh = cal.get(Calendar.MONTH);
        int ngaySinh = cal.get(Calendar.DAY_OF_MONTH);

        System.out.println("ngay thang nam sinh:" +ngaySinh+"/"+thangSinh+"/"+namSinh);

        SimpleDateFormat dinhDang = new SimpleDateFormat( "dd/MM/yyyy hh:mm:ss a" );
        Date d = cal.getTime();
        String s = dinhDang.format(d);
        System.out.println(s);

    }
}
