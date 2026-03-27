package hethonghinhhoc;

public class hinhhoc {
	    protected String ten;
	    protected String mauSac;

	    public hinhhoc() {
	    	ten=" ";
	    	mauSac=" ";
	    }

	    public hinhhoc(String ten, String mauSac) {
	        this.ten = ten;
	        this.mauSac = mauSac;
	    }

	    public double tinhDienTich() {
	        return 0;
	    }

	    public double tinhChuVi() {
	        return 0;
	    }

	    public void hienThiThongTin() {
	        System.out.println("Tên: " + ten);
	        System.out.println("Màu sắc: " + mauSac);
	        System.out.println("Diện tích: " + tinhDienTich());
	        System.out.println("Chu vi: " + tinhChuVi());
	   }
}