package Taikhoan;

public class TaiKhoanThanhToan extends TaiKhoan {
    private double hanMucRut;
    private double phiGiaoDich;
 
    public TaiKhoanThanhToan(String soTaiKhoan, String tenChuTaiKhoan,
                             double soDu, double hanMucRut, double phiGiaoDich) {
        super(soTaiKhoan, tenChuTaiKhoan, soDu);
        this.hanMucRut = hanMucRut;
        this.phiGiaoDich = phiGiaoDich;
    }
    
    public double getHanMucRut() { return hanMucRut; }
    public double getPhiGiaoDich() { return phiGiaoDich; }
 
    @Override
    public void rutTien(double soTien) {
        if (soTien <= 0) {
            System.out.println("So tien rut phai lon hon 0.");
            return;
        }
        if (soTien > hanMucRut) {
            System.out.printf("Vuot han muc rut: %.0f VND%n", hanMucRut);
            return;
        }
        double tongTru = soTien + phiGiaoDich;
        if (tongTru > soDu) {
            System.out.println("So du khong du (bao gom phi giao dich).");
            return;
        }
        soDu -= tongTru;
        System.out.printf("Rut thanh cong: %.0f VND. Phi: %.0f VND. So du: %.0f VND%n",
            soTien, phiGiaoDich, soDu);
    }
 
    public void thanhToanHoaDon(String tenHoaDon, double soTien) {
        if (soTien <= 0) {
            System.out.println("So tien hoa don phai lon hon 0.");
            return;
        }
        double tongTru = soTien + phiGiaoDich;
        if (tongTru > soDu) {
            System.out.println("So du khong du de thanh toan: " + tenHoaDon);
            return;
        }
        soDu -= tongTru;
        System.out.printf("Thanh toan '%s': %.0f VND. Phi: %.0f VND. So du: %.0f VND%n",
            tenHoaDon, soTien, phiGiaoDich, soDu);
    }
 
    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.printf("Han muc rut: %.0f VND%n", hanMucRut);
        System.out.printf("Phi giao dich: %.0f VND%n", phiGiaoDich);
    }

}