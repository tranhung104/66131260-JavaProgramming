public class nhanvien {
	private String maNV, hoTen;
	private long luongCoBan;
	private double heSoLuong;
	public nhanvien() {
		this.maNV = "null";
		this.hoTen = "null";
		this.luongCoBan = 0;
		this.heSoLuong = 0.0;
	}
	
	public String getmaNV() {
		return maNV;
	}
	
	public String gethoTen() {
		return hoTen;
	}
	
	public long getluongCoBan() {
		return luongCoBan;
	}
	
	public double heSoLuong() {
		return heSoLuong;
	}
	
	public void setmaNV(String maNV) {
		if (maNV != null && !maNV.trim().isEmpty())
			this.maNV = maNV;
		else 
			System.out.println("Ma nhan vien khong duoc de trong!"); 
	}
	
	public void sethoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	
	public void setluongCoBan(long luongCoBan) {
		if (luongCoBan >= 0)
			this.luongCoBan = luongCoBan;
		else 
			System.out.println("Luong co ban phai lon hon 0!"); 
	}
	
	public void setheSoLuong(double heSoLuong) {
		if (heSoLuong >= 0)
			this.heSoLuong = heSoLuong;
		else 
			System.out.println("He so toi thieu toi thieu la 0.1!"); 
	}
	
	public double tinhLuong() {
		return luongCoBan * heSoLuong;
	}
	
	public String xepLoai() {
		if (tinhLuong() >= 20000000) 
			return "Xuat sac";
		else 
			if (tinhLuong() >= 15000000)
				return "Tot";
		else return "Kha";
	}
	
	public void hienThiThongTin() {
		System.out.println("Ma nhan vien: " + maNV);
		System.out.println("Ten nhan vien: " + hoTen);
		System.out.println("Luong co ban: " + luongCoBan); 
		System.out.println("He so luong: " + heSoLuong);
		System.out.printf("Tong luong: %.1f\n", tinhLuong());
		System.out.println("Xep loai: " + xepLoai());
	}
}