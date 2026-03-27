package hethonghinhhoc;

	public class HinhTron extends hinhhoc {
	    private double banKinh;

	    public HinhTron(String ten, String mauSac, double banKinh) {
	        super(ten, mauSac);
	        this.banKinh = banKinh;
	    }

	    @Override
	    public double tinhDienTich() {
	        return Math.PI * banKinh * banKinh;
	    }

	    @Override
	    public double tinhChuVi() {
	        return 2 * Math.PI * banKinh;
	    }
	}
