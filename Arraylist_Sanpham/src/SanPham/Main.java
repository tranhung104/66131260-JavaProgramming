package SanPham;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SanPham sp1 = new SanPham();
        
        System.out.println("Mời nhập thông tin sản phẩm:");
        sp1.nhap();
        
        System.out.println("\nThông tin sản phẩm vừa nhập:");
        sp1.xuat();
        
        SanPham sp2 = new SanPham("Laptop", 25000000, 123456);
        System.out.println("\nThông tin sản phẩm có sẵn:");
        sp2.xuat();
	}

}