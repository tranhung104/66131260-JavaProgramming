package ThietbiDienTu;

public class Main {
	public static void main(String[] args) {
        DienThoaiThongMinh dt = new DienThoaiThongMinh("Galaxy S25", 19999999, "Samsung");
        Laptop lt = new Laptop("MacBook M1", 12300000, "Apple");

        dt.hienThiThongTin();
        dt.bat();
        dt.ketNoiWifi();
        dt.vuot();

        lt.hienThiThongTin();
        lt.bat();
        lt.ketNoiWifi();
    }
}