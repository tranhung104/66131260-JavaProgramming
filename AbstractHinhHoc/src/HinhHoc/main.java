package Hinhhoc;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {

	public static void main(String[] args) {
		
		ArrayList<HinhHoc> hv =new ArrayList<HinhHoc>();
		Scanner nc =new Scanner(System.in);	
		System.out.println("nhap n phan tu:");
		int n=nc.nextInt();
		int chon;
		for(int i=0; i<n;i++) {
			do {
				System.out.println("nhap hinh  (1:HinhTron/2:HinhVuong):");	
				 chon=nc.nextInt();
			}while(chon< 1||chon>2);
			if (chon==1) {
				
				System.out.println("nhap ban kinh:");
				double r=nc.nextDouble();
				nc.nextLine();
				System.out.println("nhap mau sac:");
				String ms=nc.nextLine();
				HinhHoc h1 =new HinhTron(ms,r);
				double dk = ((HinhTron) h1).tinhDuongKinh();
				System.out.println("duong kinh:"+dk);
				System.out.println("nhap ty le:");
				double tl=nc.nextDouble();
				h1.phongTo(tl);
				h1.hienThiThongTin();
				
				hv.add(h1);
			}
			if (chon==2) {
				
				System.out.println("nhap canh:");
				double c=nc.nextDouble();
				nc.nextLine();
				System.out.println("nhap mau sac:");
				String ms=nc.nextLine();
				HinhHoc h2 =new HinhVuong(ms, c);
				double dc = ((HinhVuong) h2).tinhDuongCheo();
				System.out.println("duong cheo:"+dc);
				System.out.println("nhap ty le:");
				double tl=nc.nextDouble();
				h2.phongTo(tl);
				hv.add(h2);
				h2.hienThiThongTin();
			}
		}
		
	}	

}