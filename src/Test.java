import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Test {
    public static void main(String[] args)  {
        Scanner sc= new Scanner(System.in);
        SimpleDateFormat sdf =  new SimpleDateFormat("dd/MM/yyyy");
        Date d = null;
        try {
            d = sdf.parse("08/03/2022");
        } catch (ParseException e) {
        }
        DanhSachHangHoa dSHH = new DanhSachHangHoa();
        // HangHoa hH = new HangThucPham("9999", "Mi Hao Hao", 1, 500, d, new Date(), "ACE Cook");
    //     HangHoa hH1 = new HangThucPham("003", "Mi Hao Hao", 1, 500, d, new Date(), "ACE Cook");
    //     HangHoa hH2 = new HangDienMay("002","May lanh",1,700,3,3);
        // dSHH.them(hH);
    //     dSHH.them(hH1);
    //     dSHH.them(hH2);

    // //    HangHoa hH3 = new HangSanhSu("003", "Chen Su", 100, 700, "Hoa lu", d);
    // //    System.out.println(hH2); 

    //     HangHoa newhH = new HangSanhSu("111", "Mi", 50,100 , "Son THanh", d);
    //     dSHH.them(newhH);
    //     HangHoa newhH2 = new HangSanhSu("1112", "xe1", 150,70 , "San THin", d);
    //     HangHoa newhH3 = new HangSanhSu("1113", "xe2", 150,30 , "San THih", d);
    //     HangHoa newhH4 = new HangSanhSu("1114", "xe3", 150,115 , "San THnh", d);
    //     dSHH.them(newhH2);
    //     dSHH.them(newhH3);
    //     dSHH.them(newhH4);
        //dSHH.thongKeDGHH();
        dSHH.inDS();
        System.out.println("Nhap ten file: ");
        //dSHH.ghiVaoFile(sc.nextLine());
        dSHH.layTuFile(sc.nextLine());
        dSHH.inDS();

        
    }
}
