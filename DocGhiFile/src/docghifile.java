/**
 * 
 */

/**
 * 
 */
public class docghifile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileWriter fw=new FileWriter("docghifile.txt",true);
				fw.write("nhật ký:\n");
				fw.write("em tên là Lê Hải Phát.Lớp 66.CNTT1.Sinh sống tại Nha Trang,Khánh Hòa.Hiện đang học Java\n");
				fw.close();
				
			Scanner docfile=new Scanner(new java.io.File("docghifile.txt"));
			while(docfile.hasNextLine()) {
				System.out.println(docfile.nextLine());
			}
			docfile.close();	
			
		}
		catch(IOException e) {
			System.out.println("Lỗi:"+ e.getMessage());
			
		}

	}

}
