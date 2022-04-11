public class HangDienMay extends HangHoa{
    private int tGBaoHanh;
    private double congSuat;

    public int gettGBaoHanh() {
        return tGBaoHanh;
    }
    public void settGBaoHanh(int tGBaoHanh) {
        if(tGBaoHanh >= 0){
            this.tGBaoHanh = tGBaoHanh;
        }else{
            System.err.println("Thoi gian bao hanh khong am!!!");
            System.err.println("Chuyen sang mac dinh");
            System.err.println("Thoi gian bao hanh: 0\n");
            this.tGBaoHanh = 0;
        }
    }
    public double getCongSuat() {
        return congSuat;
    }
    public void setCongSuat(double congSuat) {
        if(congSuat >0){
            this.congSuat = congSuat;
        }else{
            System.err.println("Cong suat phai lon hon 0!!!");
            System.err.println("Chuyen sang mac dinh");
            System.err.println("Cong suat: 1\n");
            this.congSuat = 1;
        }
    }

    
    public HangDienMay() {
    }
    public HangDienMay(String maHang, String tenHang, int soLuongTon, double donGia, int tGBaoHanh, double congSuat) {
        super(maHang, tenHang, soLuongTon, donGia);
        this.settGBaoHanh(tGBaoHanh);
        this.setCongSuat(congSuat);
    }

    @Override
    double tinhTienVAT() {
        return this.getDonGia()*0.1;
    }
    @Override
    String danhGia() {
        if(this.getSoLuongTon()<3){
            return "Ban duoc";
        }
        return "";
    }

    @Override
    public String toString() {
        
        return "Hang dien may"+super.toString()+"\nThoi Gian Bao Hanh: "+this.tGBaoHanh+" thang"+"\nCong Suat: "+this.congSuat+" KW"
        +"\nTien VAT: "+this.tinhTienVAT()+"\nDanh gia: "+this.danhGia()+"\n";
    }

    

    
}
