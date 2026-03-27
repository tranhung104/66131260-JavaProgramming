package Phuongtien;

public class Mainphuongtien {

	public static void main(String[] args) {
		XeMay xeSo = new XeMay("Honda", 2022, 35.9, 150, XeMay.LoaiXe.so);
        XeMay xeTayGa = new XeMay("Yamaha", 2023, 52.5, 125, XeMay.LoaiXe.tayGa);
        Oto otoXang = new Oto("Toyota", 2023, 800.0, 5, Oto.KieuDongCo.xang);
        Oto otoDau = new Oto("Ford", 2022, 950.0, 7, Oto.KieuDongCo.dau);
        Oto otoDien = new Oto("VinFast", 2024, 690.0, 5, Oto.KieuDongCo.dien);
 
        xeSo.hienThiThongTin();
        xeTayGa.hienThiThongTin();
        otoXang.hienThiThongTin();
        otoDau.hienThiThongTin();
        otoDien.hienThiThongTin();
	}
}