package HinhHoc;

public class HinhVuong extends HinhHoc {
private double canh;
    
    public HinhVuong(String mauSac, double canh) {
        super(mauSac);
        this.canh = canh;
    }
    
    @Override
    public double tinhDienTich() {
        return canh * canh;
    }
    
    @Override
    public double tinhChuVi() {
        return canh * 4;
    }
    
    @Override
    public void phongTo(double tyLe) {
        this.canh *= tyLe;
        System.out.println("Phóng to hình vuông lên " + tyLe + " lần");
    }
    
    // Phương thức riêng
    public double tinhDuongCheo() {
        return canh * Math.sqrt(2);
    }
}