package Taikhoan;

public class TaiKhoan {
	private String soTaiKhoan;
	private String tenChuTaiKhoan;
	protected double soDu;
 
    public TaiKhoan(String soTaiKhoan, String tenChuTaiKhoan, double soDu) {
        this.soTaiKhoan = soTaiKhoan;
        this.tenChuTaiKhoan = tenChuTaiKhoan;
        this.soDu = soDu;
    }

    public String getSoTaiKhoan() { return soTaiKhoan; }
    public String getTenChuTaiKhoan() { return tenChuTaiKhoan; }
    public double getSoDu() { return soDu; }
    
    public void guiTien(double soTien) {
        if (soTien <= 0) {
            System.out.println("So tien gui phai lon hon 0.");
            return;
        }
        soDu += soTien;
        System.out.printf("Gui thanh cong: %.0f VND. So du: %.0f VND%n", soTien, soDu);
    }
 
    public void rutTien(double soTien) {
    	
    }
    
    public void hienThiThongTin() {
        System.out.println("So tai khoan: " + soTaiKhoan);
        System.out.println("Chu tai khoan: " + tenChuTaiKhoan);
        System.out.printf("So du: %.0f VND%n", soDu);
    }
}