package vd2_arraylist;
import java.util.ArrayList;
import java.util.List;

public class vd2 {
	
	// Lớp SinhVien
	    private String maSV;
	    private String hoTen;
	    private double diemTB;
	    
	    public vd2(String maSV, String hoTen, double diemTB) {
	        this.maSV = maSV;
	        this.hoTen = hoTen;
	        this.diemTB = diemTB;
	    }
	    
	    // Getter
	    public String getMaSV() { return maSV; }
	    public String getHoTen() { return hoTen; }
	    public double getDiemTB() { return diemTB; }
	   
	    @Override
	    public String toString() {
	        return String.format("Mã: %s | Họ tên: %s | Điểm TB: %.2f",  maSV, hoTen, diemTB);
	    }
	}
//Lớp quản lý sinh viên sử dụng ArrayList
class QuanLySinhVien {
private List<vd2> danhSachSV;

public QuanLySinhVien() {
   danhSachSV = new ArrayList<>();
}

// Thêm sinh viên - add()
public void themSinhVien(vd2 sv) {
   danhSachSV.add(sv);
   System.out.println("Đã thêm: " + sv.getHoTen());
}

// Tìm sinh viên theo mã - sử dụng get() và vòng lặp
public vd2 timTheoMa(String maSV) {
   for (vd2 sv : danhSachSV) {
       if (sv.getMaSV().equals(maSV)) {
           return sv;
       }
   }
   return null;
}

// Tìm sinh viên có điểm cao nhất
public vd2 timDiemCaoNhat() {
   if (danhSachSV.isEmpty()) {
       return null;
   }
   
   vd2 svCaoNhat = danhSachSV.get(0);
   for (vd2 sv : danhSachSV) {
       if (sv.getDiemTB() > svCaoNhat.getDiemTB()) {
           svCaoNhat = sv;
       }
   }
   return svCaoNhat;
}

//Tính điểm trung bình của cả lớp
public double tinhDiemTrungBinhLop() {
if (danhSachSV.isEmpty()) {
    return 0;
}

double tong = 0;
for (vd2 sv : danhSachSV) {
    tong += sv.getDiemTB();
}
return tong / danhSachSV.size();
}

//Lọc sinh viên có điểm >= điểm cho trước
public List<vd2> locSinhVienTheoDiem(double diemToiThieu) {
List<vd2> ketQua = new ArrayList<>();
for (vd2 sv : danhSachSV) {
    if (sv.getDiemTB() >= diemToiThieu) {
        ketQua.add(sv);
    }
}
return ketQua;
}

//Sắp xếp theo điểm (giảm dần) - sử dụng thuật toán đơn giản
public void sapXepTheoDiem() {
// Sử dụng bubble sort
for (int i = 0; i < danhSachSV.size() - 1; i++) {
    for (int j = 0; j < danhSachSV.size() - i - 1; j++) {
        if (danhSachSV.get(j).getDiemTB() < danhSachSV.get(j + 1).getDiemTB()) {
            // Hoán đổi
            vd2 temp = danhSachSV.get(j);
            danhSachSV.set(j, danhSachSV.get(j + 1));
            danhSachSV.set(j + 1, temp);
        }
    }
}
}

//Hiển thị toàn bộ sinh viên
public void hienThiDanhSach() {
if (danhSachSV.isEmpty()) {
    System.out.println("Danh sách sinh viên trống!");
    return;
}

System.out.println("\n=== DANH SÁCH SINH VIÊN ===");
System.out.println(String.format("STT", "Mã SV", "Họ tên", "Điểm TB"));
System.out.println("=".repeat(50));

for (int i = 0; i < danhSachSV.size(); i++) {
    vd2 sv = danhSachSV.get(i);
    System.out.println(String.format((i+1) + sv.getMaSV()+ sv.getHoTen()+ sv.getDiemTB()));
}
}

//Xóa sinh viên theo mã - remove()
public boolean xoaSinhVien(String maSV) {
for (int i = 0; i < danhSachSV.size(); i++) {
    if (danhSachSV.get(i).getMaSV().equals(maSV)) {
        vd2 svBiXoa = danhSachSV.remove(i);
        System.out.println("Đã xóa: " + svBiXoa.getHoTen());
        return true;
    }
}
System.out.println("Không tìm thấy sinh viên với mã: " + maSV);
return false;
}

//Sử dụng subList()
public void hienThiHaiSinhVienDauTien() {
if (danhSachSV.size() >= 2) {
    List<vd2> subList = danhSachSV.subList(0, 2);
    System.out.println("\nHai sinh viên đầu tiên:");
    subList.forEach(System.out::println);
}
}
}

//Chương trình chính
class MainQuanLySinhVien {
public static void main(String[] args) {
System.out.println("=== HỆ THỐNG QUẢN LÝ SINH VIÊN VỚI ARRAYLIST ===\n");

QuanLySinhVien qlsv = new QuanLySinhVien();

// Thêm sinh viên
qlsv.themSinhVien(new vd2("SV001", "Nguyễn Văn A", 8.5));
qlsv.themSinhVien(new vd2("SV002", "Trần Thị B", 7.2));
qlsv.themSinhVien(new vd2("SV003", "Lê Văn C", 6.8));
qlsv.themSinhVien(new vd2("SV004", "Phạm Thị D", 9.1));
qlsv.themSinhVien(new vd2("SV005", "Hoàng Văn E", 5.5));

// Hiển thị danh sách
qlsv.hienThiDanhSach();

// Tìm sinh viên
System.out.println("\n=== TÌM KIẾM SINH VIÊN ===");
vd2 sv = qlsv.timTheoMa("SV003");
System.out.println("Tìm SV003: " + (sv != null ? sv : "Không tìm thấy"));

// Tìm điểm cao nhất
System.out.println("\n=== SINH VIÊN ĐIỂM CAO NHẤT ===");
vd2 svCaoNhat = qlsv.timDiemCaoNhat();
System.out.println(svCaoNhat != null ? svCaoNhat : "Không có sinh viên");

// Tính điểm trung bình lớp
System.out.println("\n=== ĐIỂM TRUNG BÌNH LỚP ===");
System.out.printf("Điểm TB lớp:%.2f",qlsv.tinhDiemTrungBinhLop());

// Lọc sinh viên
System.out.println("\n=== SINH VIÊN CÓ ĐIỂM >= 8.0 ===");
List<vd2> svGioi = qlsv.locSinhVienTheoDiem(8.0);
if (!svGioi.isEmpty()) {
   svGioi.forEach(System.out::println);
} else {
   System.out.println("Không có sinh viên nào đạt điểm >= 8.0");
}

// Sắp xếp
System.out.println("\n=== DANH SÁCH SAU KHI SẮP XẾP (GIẢM DẦN THEO ĐIỂM) ===");
qlsv.sapXepTheoDiem();
qlsv.hienThiDanhSach();

// Xóa sinh viên
System.out.println("\n=== XÓA SINH VIÊN ===");
qlsv.xoaSinhVien("SV002");
qlsv.hienThiDanhSach();

// Sử dụng subList
qlsv.hienThiHaiSinhVienDauTien();
}
}