package ThietbiDienTu;

public class DienThoaiThongMinh extends ThietBiDienTu implements KetnoiInternet, CamUng {

    public DienThoaiThongMinh(String ten, int gia, String hangSanXuat) {
        super(ten, gia, hangSanXuat);
    }

    @Override
    public void cham() {
        System.out.println("Điện thoại " + ten + ": Phản hồi thao tác chạm.");
    }

    @Override
    public void vuot() {
        System.out.println("Điện thoại " + ten + ": Phản hồi thao tác vuốt màn hình.");
    }

    @Override
    public void ketNoiWifi() {
        System.out.println(ten + " đã kết nối Wifi.");
    }

    @Override
    public void ngatKetNoi() {
        System.out.println(ten + " đã ngắt kết nối.");
    }

    @Override
    public void bat() {
        System.out.println("Điện thoại " + ten + " đang khởi động...");
    }

    @Override
    public void tat() {
        System.out.println("Điện thoại " + ten + " đang tắt nguồn...");
    }

}