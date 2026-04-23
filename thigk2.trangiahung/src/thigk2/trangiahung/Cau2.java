package thigk2.trangiahung;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Câu 2: Quản lý sinh viên
 * - Tạo danh sách 3 SV hard-code, in ra
 * - Thêm 1 SV từ bàn phím, in lại danh sách
 * - In danh sách SV có tuổi > 20
 */
public class Cau2 {
    public static void main(String[] args) {
        ArrayList<SinhVien> danhSach = new ArrayList<>();

        // Hard-code 3 sinh viên
        danhSach.add(new SinhVien("SV001", "Nguyen Van A", 2003, "66-CNTT-2"));
        danhSach.add(new SinhVien("SV002", "Tran Thi B",   2004, "66-CNTT-2"));
        danhSach.add(new SinhVien("SV003", "Le Van C",     2002, "66-CNTT-2"));

        System.out.println("=== Danh sách sinh viên ban đầu ===");
        for (SinhVien sv : danhSach) {
            System.out.println(sv);
        }

        // Thêm sinh viên mới từ bàn phím
        Scanner sc = new Scanner(System.in);
        System.out.println("\nNhập thông tin sinh viên mới:");
        System.out.print("Mã SV: ");    String ma = sc.nextLine();
        System.out.print("Họ tên: ");   String ten = sc.nextLine();
        System.out.print("Năm sinh: "); int nam = Integer.parseInt(sc.nextLine());
        System.out.print("Lớp: ");      String lop = sc.nextLine();

        danhSach.add(new SinhVien(ma, ten, nam, lop));

        System.out.println("\n=== Danh sách sau khi thêm ===");
        for (SinhVien sv : danhSach) {
            System.out.println(sv);
        }

        // In SV tuổi > 20
        int namHienTai = java.time.Year.now().getValue();
        System.out.println("\n=== Sinh viên lớn hơn 20 tuổi ===");
        for (SinhVien sv : danhSach) {
            if ((namHienTai - sv.getnamsinh()) > 20) {
                System.out.println(sv);
            }
        }

        sc.close();
    }
}