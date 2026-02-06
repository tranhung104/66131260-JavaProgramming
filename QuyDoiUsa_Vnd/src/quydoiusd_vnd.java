import java.util.Scanner;
public class quydoiusd_vnd {

    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        double vnd = 25000;
        
        System.out.println("Nhập số tiền USD cần đổi:");
        
        if (c.hasNextDouble()) {
            double usd = c.nextDouble();
            System.out.printf("Số tiền quy đổi sang VND là: %.1f VNĐ", (usd * vnd));
        } else {
            System.out.println("Lỗi: Vui lòng nhập vào một con số!");
        }
        
        c.close();
    }
}