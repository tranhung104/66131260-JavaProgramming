package hethonghinhhoc;

	public class Hinhchunhat extends hinhhoc {
	    private double chieuDai;
	    private double chieuRong;

	    public Hinhchunhat(String ten, String mauSac, double chieuDai, double chieuRong) {
	        super(ten, mauSac);
	        this.chieuDai = chieuDai;
	        this.chieuRong = chieuRong;
	    }

	    @Override
	    public double tinhDienTich() {
	        return chieuDai * chieuRong;
	    }

	    @Override
	    public double tinhChuVi() {
	        return 2 * (chieuDai + chieuRong);
	    }
	}
