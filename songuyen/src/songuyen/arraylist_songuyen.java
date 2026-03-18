package songuyen;

import java.util.ArrayList;
import java.util.Scanner;

public class arraylist_songuyen {
    public static void main(String[] args) {
        ArrayList<Integer> danhSachSoNguyen = new ArrayList<>();
        Scanner banPhim = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.print("Mời nhập phần tử thứ " + i + ": ");
            int tam = banPhim.nextInt();
            danhSachSoNguyen.add(tam);
        }

        System.out.println("Danh sách vừa nhập là: ");
        for (Integer x : danhSachSoNguyen) {
            System.out.print(x + " ");
        }
        System.out.println();

        int soLuongChan = 0;
        for (Integer x : danhSachSoNguyen) {
            if (x % 2 == 0) {
                soLuongChan++;
            }
        }
        System.out.println("Số phần tử chẵn là: " + soLuongChan);

        int tong = 0;
        for (Integer x : danhSachSoNguyen) {
            tong += x;
        }
        System.out.println("Tổng tất cả các phần tử là: " + tong);
    }
}