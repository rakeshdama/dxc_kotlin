package advanced.io;

import java.io.FileOutputStream;

public class FileOutputStreamExample {
	
	public static void main(String[] args) {
		FileOutputStream file;
		try {
			file = new FileOutputStream("/home/daredevil/dxc/testout.txt");
			
			file.write(82);
			
			file.close();
			
			System.out.println("Success...");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
