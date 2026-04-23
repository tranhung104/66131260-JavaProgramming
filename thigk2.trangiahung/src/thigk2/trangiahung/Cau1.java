package thigk2.trangiahung;

import java.util.Scanner;

/**
 * Câu 1: Nhập chiều cao, cân nặng từ bàn phím
 * Tính BMI = cân nặng / (chiều cao * chiều cao)
 * Phân loại theo chỉ số BMI
 */

public class Cau1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập Chiều cao (m): ");
		double chieucao = sc.nextDouble();
		
		System.out.print("Nhập cân nặng (kg): ");
		double cannang= sc.nextDouble();
		
		double bmi = cannang / (chieucao * chieucao);
		System.out.printf("Chỉ số bmi: %.2f%n", bmi);
		
		String tinhtrang;
		if (bmi < 18.5) {
			tinhtrang = "Thiếu cân";
		} else if (bmi < 24.9) {
			tinhtrang = "Bình thường";
		} else if (bmi < 29.9) {
			tinhtrang = "Thừa cân";
		} else {
			tinhtrang = "Béo phì";
		}
		System.out.println("tình trạng cơ thể: " + tinhtrang);
		sc.close();
	}
}
