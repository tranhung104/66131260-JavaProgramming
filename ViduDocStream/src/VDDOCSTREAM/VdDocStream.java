package VDDOCSTREAM;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class VdDocStream {
	public static void main(String[] args) throws IOException{
		//Khai báo biến đối tượng InputStreamReader
		InputStreamReader ipReader = new InputStreamReader(System.in);
		//Khai báo biến đối tượng Buffered
		BufferedReader bufReader = new BufferedReader(ipReader);
		
		//In 1 câu hd để biết User cần làm gì
		System.out.print("Nhập 1 chuỗi bất kì: ");
		//Đọc dữ liệu từ bàn phím, cắt vào biến chuỗi
		String lineDocDuoc = bufReader.readLine();
		//In ra dòng đọc được
		System.out.print(lineDocDuoc);
	}
}