package Phuongtien;

public class PhuongTien {
	private String hangSanXuat;
	private int namSanXuat;
	protected double giaBan;
 
    public PhuongTien(String hangSanXuat, int namSanXuat, double giaBan) {
        this.hangSanXuat = hangSanXuat;
        this.namSanXuat = namSanXuat;
        this.giaBan = giaBan;
    }

    public String getHangSanXuat() { return hangSanXuat; }
    
    public void setHangSanXuat(String hangSanXuat) { this.hangSanXuat = hangSanXuat; }
 
    public int getNamSanXuat() { return namSanXuat; }
    
    public void setNamSanXuat(int namSanXuat) { this.namSanXuat = namSanXuat; }
 
    public double getGiaBan() { return giaBan; }
    
    public void setGiaBan(double giaBan) { this.giaBan = giaBan; }
    
    public int layVanTocToiDa() {
    	return 0;
    };
    
    public int laySoChoNgoi() {
    	return 0;
    };
    
    public void hienThiThongTin() {
        System.out.println("  Hãng sản xuất : " + hangSanXuat);
        System.out.println("  Năm sản xuất : " + namSanXuat);
        System.out.printf ("  Giá bán : %.0f triệu đồng%n", giaBan);
        System.out.printf ("  Vận tốc tối đa : %d km/h%n", layVanTocToiDa());
        System.out.println("  Số chỗ ngồi : " + laySoChoNgoi());
    }
}