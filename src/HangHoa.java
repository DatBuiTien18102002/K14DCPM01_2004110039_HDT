import java.io.Serializable;

public abstract class HangHoa implements Serializable{
    
    private String maHang;
    private String tenHang;
    private int soLuongTon;
    private double donGia;
    //Scanner sc = new Scanner(System.in);

    public String getMaHang() {
        return maHang;
    }
    private void setMaHang(String maHang) {
        if(maHang != null){
            this.maHang = maHang;
        }else{
            System.err.println("Ma hang khong duoc de trong!!!");
            System.err.println("Chuyen sang  mac dinh ");
            System.err.println("Ma hang: 0000\n");
            this.maHang = "0000";
        }
    }
    public String getTenHang() {
        return tenHang;
    }
    public void setTenHang(String tenHang) {
        if(tenHang != null){
            this.tenHang = tenHang;
        }else{
            System.err.println("Ten hang khong duoc rong!!!");
            System.err.println("Chuyen sang mac dinh");
            System.err.println("Ten Hang: Chua dat ten\n");
            this.tenHang = "Chua dat ten";
        }
    }
    public int getSoLuongTon() {
        return soLuongTon;
    }
    public void setSoLuongTon(int soLuongTon) {
        if(soLuongTon >=0){
            this.soLuongTon = soLuongTon;
        }else{
            System.err.println("So luong ton khong duoc am!!!");
            System.err.println("Chuyen sang mac dinh");
            System.err.println("So luong ton: 0\n");
            this.soLuongTon = 0;
        }
    }
    public double getDonGia() {
        return donGia;
    }
    public void setDonGia(double donGia) {
        if(donGia > 0){
            this.donGia = donGia;
        }else{
            System.err.println("Don gia phai lon hon 0!!!");
            System.err.println("Chuyen sang mac dinh");
            System.err.println("Don gia: 1\n");
            this.donGia = 1;
        }
    }


    public HangHoa() {
    }
    public HangHoa(String maHang, String tenHang, int soLuongTon, double donGia) {
        this.setMaHang(maHang);
        this.setTenHang(tenHang);
        this.setSoLuongTon(soLuongTon);
        this.setDonGia(donGia);
    }

    abstract double tinhTienVAT();
    abstract String danhGia();

    @Override
    public String toString() {
 
        return "\nMa hang: "+this.maHang+"\nTen hang: "+this.tenHang+"\nSo luong ton: "+this.soLuongTon
        +"\nDon Gia: "+this.donGia;

    }

    
    
    
}
