package ThietbiDienTu;

public class Laptop extends ThietBiDienTu implements KetnoiInternet {
	public Laptop(String ten, int gia, String hangSanXuat) {
		super(ten, gia, hangSanXuat);
		// TODO Auto-generated constructor stub
	}

	@Override
    public void bat() { System.out.println("Laptop " + ten + " đang khởi động Windows/macOS..."); }

    @Override
    public void tat() { System.out.println("Laptop " + ten + " đang Shutting down..."); }

    @Override
    public void ketNoiWifi () { System.out.println(ten + " đã kết nối qua card mạng không dây."); }

    @Override
    public void ngatKetNoi () { System.out.println(ten + " đã ngắt kết nối mạng."); }
}