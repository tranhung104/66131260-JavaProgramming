package hethonghinhhoc;

public class Mainhinhhoc {

	public static void main(String[] args) {
		        HinhChuNhat hcn = new HinhChuNhat("Hình chữ nhật", "Đỏ", 5, 3);
		        HinhTron ht = new HinhTron("Hình tròn", "Xanh", 2.5);
		        HinhTamGiac htg = new HinhTamGiac("Hình tam giác", "Vàng", 3, 4, 5);

		        System.out.println("=== Hình chữ nhật ===");
		        hcn.hienThiThongTin();

		        System.out.println("\n=== Hình tròn ===");
		        ht.hienThiThongTin();

		        System.out.println("\n=== Hình tam giác ===");
		        htg.hienThiThongTin();
		    }
	}

