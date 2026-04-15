package DTOS;

import java.io.BufferedReader;
import java.io.FileReader;

public class Dtos {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		FileReader fr = new FileReader("D:\\LapTrinhJavaProjects\\66131260-JavaProgramming\\KtoD\\chaythu.txt");  
	    BufferedReader br = new BufferedReader(fr);  
	    String s;  
	    while((s = br.readLine()) != null)   
	    {  
	      System.out.println(s);  
	    }  
	    fr.close();  
	}

}