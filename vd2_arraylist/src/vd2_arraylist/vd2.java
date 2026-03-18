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
