package thigk2.trangiahung;

import java.io.*;
import java.util.ArrayList;

/**
 * Cách giải:
 * 1. Dùng BufferedReader đọc từng dòng file numbers.txt (100 số nguyên)
 *    parse sang int, add vào ArrayList<Integer>
 * 2. In toàn bộ danh sách ra màn hình
 * 3. X = ký tự cuối MSSV (ví dụ MSSV 6613D60 thì X = 0)
 *    Dùng contains() kiểm tra X có trong danh sách không, in kết quả
 */

public class Cau3 {
	public static void main(String[] args) {
		int X = 0;
		
		ArrayList<Integer> danhsach = new ArrayList<>();
		try (BufferedReader br = new BufferedReader(new FileReader("numbers.txt"))) {
			String line;
			while ((line = br.readLine()) != null) {
				line = line.trim();
				if (!line.isEmpty()) {
					danhsach.add(Integer.parseInt(line));
				}
			}
		} catch (IOException e) {
			System.out.println(" Lỗi đọc file: " + e.getMessage());
			return;
		}
		System.out.println(" Danh sách 100 số nguyên");
		for (int i = 0; i < danhsach.size(); i++) {
			System.out.print(danhsach.get(i));
			if (i < danhsach.size() - 1) System.out.print(", ");
		}
		System.out.println();
		
		boolean cotrongDS = danhsach.contains(X);
		System.out.println(" Gia Tri X = " + X);
		System.out.println("X " + (cotrongDS ? "Có" : "Không có ") + "trong danh sách.");
	}
}
