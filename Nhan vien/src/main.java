public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		nhanvien nv1 =  new nhanvien();
		nv1.setmaNV("NV001");
		nv1.sethoTen("Tran Van A");
		nv1.setluongCoBan(10000000);
		nv1.setheSoLuong(2.0);
		nv1.hienThiThongTin();
		
		nhanvien nv2 =  new nhanvien();
		nv2.setmaNV("");
		nv2.sethoTen("Le Van B");
		nv2.setluongCoBan(3000000);
		nv2.setheSoLuong(3.0);
		nv2.hienThiThongTin();
	}

}