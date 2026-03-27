package hethonghinhhoc;

	public class HinhTamGiac extends hinhhoc {
	    private double canhA, canhB, canhC;

	    public HinhTamGiac(String ten, String mauSac, double a, double b, double c) {
	        super(ten, mauSac);
	        this.canhA = a;
	        this.canhB = b;
	        this.canhC = c;
	    }

	    public boolean kiemTraHopLe() {
	        return (canhA + canhB > canhC) &&
	               (canhA + canhC > canhB) &&
	               (canhB + canhC > canhA);
	    }

	    @Override
	    public double tinhChuVi() {
	        if (!kiemTraHopLe()) return 0;
	        return canhA + canhB + canhC;
	    }

	    @Override
	    public double tinhDienTich() {
	        if (!kiemTraHopLe()) return 0;
	        double p = tinhChuVi() / 2;
	        return Math.sqrt(p * (p - canhA) * (p - canhB) * (p - canhC));
	    }

	    @Override
	    public void hienThiThongTin() {
	        super.hienThiThongTin();
	        System.out.println("Hợp lệ: " + kiemTraHopLe());
	    }
	}
