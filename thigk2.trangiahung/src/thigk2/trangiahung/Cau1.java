package thigk2.trangiahung;

import java.util.Scanner;

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
			tinhtrang = "Béo pfih";
		}
		
	}
}
