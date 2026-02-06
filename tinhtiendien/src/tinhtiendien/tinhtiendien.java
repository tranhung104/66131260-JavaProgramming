/**
 * 
 */
package tinhtiendien;
import java.util.Scanner;
/**
 * 
 */
public class tinhtiendien {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner c = new Scanner(System.in);
		double tien=0;
		
		System.out.println("===BẢNG GIÁ===");
		System.out.println("0-50kwh:8126");
		System.out.println("51-100kwh:81206");
		System.out.println("101-200kwh:12006");
		System.out.println("201-300kwh:800126");
		System.out.println(">=301kwh:8126000");
		System.out.println("=================");
		System.out.println("nhập số kwh:");
		int kwh=c.nextInt();
				
		if(kwh<=50) {
			tien=kwh*8126;
		}
		else if(kwh<=100) {
			tien=50*8126+(kwh-50)*81206;
		}
		else if(kwh<=200) {
			tien=50*8126+50*81206+(kwh-100)*12006;
		}else if(kwh<=300) {
			tien=50*8126+50*81206+100*12006+(kwh-200)*800126;
		}else {
			tien=50*8126+50*81206+100*12006+100*800126+(kwh-300)*8126000;
		}
		System.out.printf("Số tiền khi dùng %d kwh là:%f",kwh,tien);
	}

}