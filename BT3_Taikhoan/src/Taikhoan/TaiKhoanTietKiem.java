package Taikhoan;

public class TaiKhoanTietKiem extends TaiKhoan{
	private int kyHan;
    private double laiSuat;
    private boolean daoDenHan;
 
    public TaiKhoanTietKiem(String soTaiKhoan, String tenChuTaiKhoan,
                            double soDu, int kyHan, double laiSuat) {
        super(soTaiKhoan, tenChuTaiKhoan, soDu);
        this.kyHan = kyHan;
        this.laiSuat = laiSuat;
        this.daoDenHan = false;
    }

    public int getKyHan() { return kyHan; }
    public double getLaiSuat() { return laiSuat; }

    public double tinhLaiSuat() {
        return soDu * (laiSuat / 100) * ((double) kyHan / 12);
    }
 
    @Override
    public void rutTien(double soTien) {
        if (!daoDenHan) {
            System.out.println("Khong the rut tien truoc ky han " + kyHan + " thang.");
            return;
        }
        if (soTien > soDu) {
            System.out.println("So du khong du.");
            return;
        }
        soDu -= soTien;
        System.out.printf("Rut thanh cong: %.0f VND. So du con lai: %.0f VND%n", soTien, soDu);
    }
 
    public void setDaoDenHan(boolean daoDenHan) {
        this.daoDenHan = daoDenHan;
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Ky han: " + kyHan + " thang");
        System.out.printf("Lai suat: %.2f%%%n", laiSuat);
        System.out.printf("Tien lai du kien: %.0f VND%n", tinhLaiSuat());
        System.out.println("Da den han: " + (daoDenHan ? "Co" : "Chua"));
    }
}