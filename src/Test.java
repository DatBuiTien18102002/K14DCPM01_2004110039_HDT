import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
    public static void main(String[] args)  {
        SimpleDateFormat sdf =  new SimpleDateFormat("dd/MM/yyyy");
        Date d = null;
        try {
            d = sdf.parse("08/03/2022");
        } catch (ParseException e) {
        }
    //    HangHoa hH = new HangThucPham("001", "Mi Hao Hao", 1, 500, d, new Date(), "ACE Cook");
    //    HangHoa hH2 = new HangDienMay("002","May lanh",1,700,3,3);
    //    HangHoa hH3 = new HangSanhSu("003", "Chen Su", 100, 700, "Hoa lu", d);
    //    System.out.println(hH2); 

        DanhSachHangHoa dSHH = new DanhSachHangHoa();
        HangHoa newhH = new HangSanhSu("111", "Mi", 50,100 , "Son THanh", d);
        dSHH.them(newhH);
        HangHoa newhH2 = new HangSanhSu("1111", "xe", 150,100 , "San THinh", d);
        dSHH.them(newhH2);
        dSHH.inDS();
    }
}
