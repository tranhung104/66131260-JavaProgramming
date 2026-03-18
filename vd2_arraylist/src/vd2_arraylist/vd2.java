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

