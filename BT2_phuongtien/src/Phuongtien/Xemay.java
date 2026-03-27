package Phuongtien;

public class Xemay extends PhuongTien{
	public enum LoaiXe { so, tayGa }
	 
    private int dungTichXiLanh;
    private LoaiXe loaiXe;
 
    public Xemay(String hangSanXuat, int namSanXuat, double giaBan,
                 int dungTichXiLanh, LoaiXe loaiXe) {
        super(hangSanXuat, namSanXuat, giaBan);
        this.dungTichXiLanh = dungTichXiLanh;
        this.loaiXe = loaiXe;
    }
    
    @Override
    public int layVanTocToiDa() {
        if (loaiXe == LoaiXe.so) {
            return dungTichXiLanh >= 150 ? 130 : 100;
        } else {
            return dungTichXiLanh >= 150 ? 120 : 90;
        }
    }

    public int laySoChoNgoi() {
        return 2;
    }
 
    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.printf ("  Dung tích xi-lanh : %d cc%n", dungTichXiLanh);
        System.out.println("  Loại xe : " +
            (loaiXe == LoaiXe.so ? "Xe số" : "Xe tay ga"));
    }
}