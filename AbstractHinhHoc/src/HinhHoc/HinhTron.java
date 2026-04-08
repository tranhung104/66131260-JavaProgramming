package Hinhhoc;

public class HinhTron extends HinhHoc {
	private double banKinh;
    
    public HinhTron(String mauSac, double banKinh) {
        super(mauSac);  // Gọi constructor của lớp cha
        this.banKinh = banKinh;
    }
    
    @Override
    public double tinhDienTich() {
        return Math.PI * banKinh * banKinh;
    }
    
    @Override
    public double tinhChuVi() {
        return 2 * Math.PI * banKinh;
    }
    
    @Override
    public void phongTo(double tyLe) {
        this.banKinh *= tyLe;
        System.out.println("Phóng to hình tròn lên " + tyLe + " lần");
    }
    
    // Phương thức riêng
    public double tinhDuongKinh() {
        return banKinh * 2;
    }
}