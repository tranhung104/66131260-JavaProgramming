package thigk2.trangiahung;

import java.io.*;
import java.util.ArrayList;

public class Cau3 {
	public static void main(String[] args) {
		int X = 0;
		
		ArrayList<Integer> danhsach = new ArrayList<>();
		try (BufferedReader br = new BufferedReader(new FileReader("numbers.txt"))) {
			String line;
			while ((line = br.readline()) != null) {
				line = line.trim();
				if (!line.isEmpty()) {
					danhsach.add(Integer.parseInt(line));
				}
			}
		} catch (IOException e) {
			System.out.println(" Lỗi đọc file: " + e.getMessage());
			return;
		}

	}
	

}
