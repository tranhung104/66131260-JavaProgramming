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
