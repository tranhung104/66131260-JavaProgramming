package ThietbiDienTu;

abstract class ThietBiDienTu {
	protected String ten;
	protected int gia;
	protected String hangSanXuat;
	
	public ThietBiDienTu(String ten, int gia, String hangSanXuat) {
		this.ten = ten;
		this.gia = gia;
		this.hangSanXuat = hangSanXuat;
	}
	
	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public int getGia() {
		return gia;
	}

	public void setGia(int gia) {
		this.gia = gia;
	}

	public String getHangSanXuat() {
		return hangSanXuat;
	}

	public void setHangSanXuat(String hangSanXuat) {
		this.hangSanXuat = hangSanXuat;
	}



	public abstract void bat();
	public abstract void tat();
	public void hienThiThongTin() {
		System.out.println("Ten: " +  ten);
		System.out.println("Gia: " +  gia);
		System.out.println("Hãng sản xuất: " +  hangSanXuat);
	}
}