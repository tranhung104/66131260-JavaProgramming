package VdReadChar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class VdReadChar {

	public static void main(String[] args)  throws IOException {
		// TODO Auto-generated method stub
		char c;  
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
	    System.out.println("Nhap chuoi ky tu, gioi han dau cham.");  
	     // read characters  
	    do   
	    {  
	      c = (char) br.read();        
	      System.out.println(c);  
	    } while(c != '.'); 
	}

}