package HocSinh;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        HocSinh hs1 = new HocSinh();
        hs1.setTenHS("Trần Văn A");
        hs1.setTuoiHS(10);
        hs1.setLopHS("5A1");

        HocSinh hs2 = new HocSinh("Lê Văn B", 12, "3C");

        System.out.println("Thông tin HS1:\n" + hs1.toString());
        System.out.println("Tên HS2: " + hs2.getTenHS());

        Scanner banPhim = new Scanner(System.in);
        HocSinh hs3 = new HocSinh();

        System.out.print("Mời nhập tên của học sinh thứ ba: ");
        hs3.setTenHS(banPhim.nextLine());
        System.out.print("Mời nhập tuổi học sinh thứ ba: ");
        hs3.setTuoiHS(Integer.parseInt(banPhim.nextLine()));
        System.out.print("Mời nhập lớp của học sinh thứ ba: ");
        hs3.setLopHS(banPhim.nextLine());

        System.out.println("Thông tin HS3 vừa nhập:\n" + hs3.toString());

        ArrayList<HocSinh> danhSachHS = new ArrayList<>();
        int n = 3;

        for (int i = 0; i < n; i++) {
            System.out.println("Nhập học sinh thứ " + (i + 1));
            HocSinh hsi = new HocSinh();
            System.out.print("Tên: ");
            hsi.setTenHS(banPhim.nextLine());
            System.out.print("Tuổi: ");
            hsi.setTuoiHS(Integer.parseInt(banPhim.nextLine()));
            System.out.print("Lớp: ");
            hsi.setLopHS(banPhim.nextLine());
            danhSachHS.add(hsi);
        }

        HocSinh hsThem = new HocSinh("Nguyễn Văn C", 15, "10A1");
        danhSachHS.add(hsThem);

        for (int i = 0; i < danhSachHS.size(); i++) {
            HocSinh hsTim = danhSachHS.get(i);
            if (hsTim.getTenHS().equals("Hoa")) {
                danhSachHS.remove(i);
                System.out.println("Đã xóa học sinh tên Hoa.");
                break;
            }
        }

        System.out.println("--- Danh sách học sinh hiện tại ---");
        for (HocSinh hs : danhSachHS) {
            System.out.println(hs.toString());
        }
    }
}