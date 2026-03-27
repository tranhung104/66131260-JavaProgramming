package Taikhoan;

public class MainTaiKhoan {
	
	public static void main(String[] args) {
		TaiKhoanTietKiem tktk = new TaiKhoanTietKiem("TK001", "Nguyen Van A", 50000000, 6, 7.5);
        TaiKhoanThanhToan tktt = new TaiKhoanThanhToan("TK002", "Tran Thi B", 10000000, 5000000, 10000);
 
        System.out.println("--- Tai khoan tiet kiem ---");
        tktk.hienThiThongTin();
 
        System.out.println("\n-- Rut truoc ky han --");
        tktk.rutTien(1000000);
 
        System.out.println("-- Rut sau ky han --");
        tktk.setDaoDenHan(true);
        tktk.rutTien(1000000);
 
        System.out.println("\n--- Tai khoan thanh toan ---");
        tktt.hienThiThongTin();
 
        System.out.println("\n-- Gui tien --");
        tktt.guiTien(2000000);
 
        System.out.println("-- Rut tien --");
        tktt.rutTien(3000000);
 
        System.out.println("-- Thanh toan hoa don --");
        tktt.thanhToanHoaDon("Tien dien", 500000);
        tktt.thanhToanHoaDon("Tien nuoc", 200000);
	}

}