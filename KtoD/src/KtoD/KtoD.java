package KtoD;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

class KtoD {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		String str;  
	    FileWriter fw; 
	    BufferedReader br = new BufferedReader( new InputStreamReader(System.in));  
	    try {  
	      fw = new FileWriter("D:\\LapTrinhJavaProjects\\66131260-JavaProgramming\\KtoD\\chaythu.txt");  
	    }  
	    catch(IOException exc) {  
	      System.out.println("Khong the mo file.");   return ;  
	    }  
	    
	    System.out.println("Nhap ('stop' de ket thuc chuong trinh).");  
	    do {  
	      System.out.print(": ");        
	      str = br.readLine();        
	      if(str.compareTo("stop") == 0) break;        
	      str = str + "\r\n";         
	      fw.write(str);  
	    } while(str.compareTo("stop") != 0);  
	    fw.close(); 
	}
}