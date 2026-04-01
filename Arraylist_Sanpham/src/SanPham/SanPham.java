package SanPham;
import java.util.Scanner;

public class SanPham {
    private String tenSp;
    private double donGia;
    private double giamGia;

    public SanPham() {}

    public SanPham(String tenSp, double donGia, double giamGia) {
        this.tenSp = tenSp;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }

    public String getTenSp() { return tenSp; }
    public void setTenSp(String tenSp) { this.tenSp = tenSp; }

    public double getDonGia() { return donGia; }
    public void setDonGia(double donGia) { this.donGia = donGia; }

    public double getGiamGia() { return giamGia; }
    public void setGiamGia(double giamGia) { this.giamGia = giamGia; }

    public double getThueNhapKhau() {
        return 0.1 * donGia;
    }

    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên sản phẩm: ");
        this.tenSp = scanner.nextLine();
        System.out.print("Nhập đơn giá: ");
        this.donGia = Double.parseDouble(scanner.nextLine());
        System.out.print("Nhập giảm giá: ");
        this.giamGia = Double.parseDouble(scanner.nextLine());
    }

    public void xuat() {
        System.out.println("----------------------------");
        System.out.println("Tên sản phẩm: " + this.tenSp);
        System.out.println("Đơn giá: " + this.donGia);
        System.out.println("Giảm giá: " + this.giamGia);
        System.out.println("Thuế nhập khẩu: " + getThueNhapKhau());
    }
}