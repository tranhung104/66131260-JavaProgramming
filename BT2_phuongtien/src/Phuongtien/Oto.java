package Phuongtien;

public class Oto extends PhuongTien {
	 
    public enum KieuDongCo { xang, dau, dien }
 
    private int soCho;
    private KieuDongCo kieuDongCo;
 
    public Oto(String hangSanXuat, int namSanXuat, double giaBan,
               int soCho, KieuDongCo kieuDongCo) {
        super(hangSanXuat, namSanXuat, giaBan);
        this.soCho = soCho;
        this.kieuDongCo = kieuDongCo;
    }
 
    @Override
    public int layVanTocToiDa() {
        int base = soCho < 5 ? 180 : 140;
        return kieuDongCo == KieuDongCo.dien ? base - 20 : base;
    }
 
    @Override
    public int laySoChoNgoi() {
        return soCho;
    }

    public double tinhThueTruocBa() {
        double giaCoVAT = giaBan * 1.10;
        double thueSuat;
 
        switch (kieuDongCo) {
            case xang: thueSuat = 0.12; break;
            case dau: thueSuat = 0.12; break;
            case dien: thueSuat = 0.00; break;
            default: thueSuat = 0.12;
        }
 
        return giaCoVAT * thueSuat;
    }
 
    private String tenKieuDongCo() {
        switch (kieuDongCo) {
            case xang: return "Động cơ xăng";
            case dau: return "Động cơ dầu (diesel)";
            case dien: return "Động cơ điện";
            default: return "Không xác định";
        }
    }

    public int getSoCho() { return soCho; }
    public void setSoCho(int soCho) { this.soCho = soCho; }
 
    public KieuDongCo getKieuDongCo() { return kieuDongCo; }
    public void setKieuDongCo(KieuDongCo kieuDongCo) { this.kieuDongCo = kieuDongCo; }
    
    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("  Kiểu động cơ: " + tenKieuDongCo());
        System.out.printf ("  Thuế trước bạ: %.2f triệu đồng%n", tinhThueTruocBa());
        if (kieuDongCo == KieuDongCo.dien) {
            System.out.println("  ✓ Xe điện – miễn thuế trước bạ (NĐ 10/2022)");
        }
    }
}