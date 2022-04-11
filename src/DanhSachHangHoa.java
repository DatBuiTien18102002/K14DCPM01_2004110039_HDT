import java.util.ArrayList;
import java.util.List;

public class DanhSachHangHoa {
    

    private List<HangHoa> danhSach = new ArrayList<>();

    public void them(HangHoa newHH) {
        for (HangHoa hangHoa : danhSach) {
            if(newHH.getMaHang().equalsIgnoreCase(hangHoa.getMaHang())){
                System.err.println("Ma hang da ton tai!!!");
                System.err.println("Them hang hoa khong thanh cong");
                return;
            }         
        }
        danhSach.add(newHH);
        System.out.println("Them hang hoa vao danh sach thanh cong");
    }

    public void inDS() {
        for (HangHoa hangHoa : danhSach) {
            System.out.println(hangHoa);
        }
    }

    public void xoaHH(HangHoa hH) {
        danhSach.remove(hH);
    }
    public void xoaTheoMaHH(String maXoa){
        for (HangHoa hangHoa : danhSach) {
            if(hangHoa.getMaHang().equalsIgnoreCase(maXoa)){
                xoaHH(hangHoa);
            }
        }
    }
    public void xoaTheoTenHH(String tenXoa) {
        for (HangHoa hangHoa : danhSach) {
            if(hangHoa.getTenHang().trim().equalsIgnoreCase(tenXoa)){
                xoaHH(hangHoa);
            }
        }
    }
}
