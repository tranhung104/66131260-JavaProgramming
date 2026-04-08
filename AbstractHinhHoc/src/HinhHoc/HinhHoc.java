package HinhHoc;

abstract class HinhHoc {
	 protected String mauSac;
	    
	    // Constructor trong abstract class
	    public HinhHoc(String mauSac) {
	        this.mauSac = mauSac;
	    }
	    
	    // Phương thức thông thường
	    public String getMauSac() {
	        return mauSac;
	    }
	    
	    public void setMauSac(String mauSac) {
	        this.mauSac = mauSac;
	    }
	    
	    // Phương thức trừu tượng - lớp con PHẢI implement
	    public abstract double tinhDienTich();
	    public abstract double tinhChuVi();
	    
	    // Phương thức trừu tượng có tham số
	    public abstract void phongTo(double tyLe);
	    
	    // Phương thức có sẵn implementation
	    public void hienThiThongTin() {
	        System.out.println("Màu sắc: " + mauSac);
	        System.out.println("Diện tích: " + tinhDienTich());
	        System.out.println("Chu vi: " + tinhChuVi());
	    }
}