package thigk2.trangiahung;

public class Cau2 {
	private String MaSv;
	private String hoten;
	private int namsinh;
	private String lop;
	
	public Cau2() {}
	
	public Cau2(String MaSv, String hoten, int namsinh, String lop) {
		this.MaSv = MaSv;
		this.hoten = hoten;
		this.namsinh = namsinh;
		this.lop = lop;
	}
	
	public String getMaSV() { return MaSv;}
	public void setMaSV(String MaSv) { this.MaSv = MaSv; }
	
	public String gethoten() {return hoten;}
	public void sethoten(String hoten) {this.hoten = hoten; }

	public int getnamsinh() { return namsinh;}
	public void setnamsinh(int namsinh) { this.namsinh = namsinh; }
	
	public String getlop() { return lop;}
	public void setlop(String lop) { this.lop = lop; }
	
	@override
	public String toString() {
		return MaSv +
	}

}
