import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HangThucPham extends HangHoa{
    private Date ngaySanXuat;
    private Date ngayHetHan;
    private String nhaCungCap;

    
    public Date getNgaySanXuat() {
        return ngaySanXuat;
    }
    public void setNgaySanXuat(Date ngaySanXuat) {
        if(ngaySanXuat != null){
        this.ngaySanXuat = ngaySanXuat;
        }else{
            System.err.println("Ngay san xuat khong duoc de trong!!!");
            System.err.println("Chuyen sang mac dinh la ngay 01/01/1970");
            System.err.println("Ngay san xuat: 01/01/1970\n");
            try {
                this.ngaySanXuat = sdf.parse("01/01/1970");
            } catch (ParseException e) {
            }
        }
    }
    public Date getNgayHetHan() {
        return ngayHetHan;
    }
    public void setNgayHetHan(Date ngayHetHan) {
        if(ngayHetHan != null){
            if (ngayHetHan.after(this.ngaySanXuat)) {
                this.ngayHetHan = ngayHetHan;
            } else {
                System.err.println("Ngay het han phai sau ngay san xuat !!!");
                System.err.println("Chuyen sang ngay mac dinh la ngay hien tai");
                System.err.println("Ngay het han: "+ sdf.format(new Date())+"\n");
                this.ngayHetHan = new Date();
            }
        }else{
            System.out.println("Ngay Het han khong duoc rong!!!");
            System.err.println("Chuyen sang ngay mac dinh la ngay hien tai");
            System.err.println("Ngay het han: "+ sdf.format(new Date())+"\n");
            this.ngayHetHan = new Date();
        }

    }
    public String getNhaCungCap() {
        return nhaCungCap;
    }
    public void setNhaCungCap(String nhaCungCap) {
        this.nhaCungCap = nhaCungCap;
    }
    public HangThucPham() {

    }
    public HangThucPham(String maHang, String tenHang, int soLuongTon, double donGia, Date ngaySanXuat, Date ngayHetHan,
            String nhaCungCap) {
        super(maHang, tenHang, soLuongTon, donGia);
        this.setNgaySanXuat(ngaySanXuat);
        this.setNgayHetHan(ngayHetHan);
        this.setNhaCungCap(nhaCungCap);
    }

    @Override
    double tinhTienVAT() {     
        return this.getDonGia()*0.05;
    }
    @Override
    String danhGia() {
        if(this.getSoLuongTon()>0 && getNgayHetHan().before(new Date())){
            return "Kho ban";
        }
        return "";
    }
    SimpleDateFormat sdf =  new SimpleDateFormat("dd/MM/yyyy");
    @Override
    public String toString() {

        return "Hang thuc pham"+super.toString()+"\nNgay san xuat: "+sdf.format(this.ngaySanXuat)+"\nNgay het han: "+sdf.format(this.ngayHetHan)
        +"\nNha cung cap: "+this.nhaCungCap+"\nTien VAT: "+this.tinhTienVAT()+"\nDanh gia: "+this.danhGia()+"\n";
    }
}
