package advanced.io;

import java.io.FileInputStream;

public class DataStreamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream fin = new FileInputStream("/home/daredevil/dxc/testout.txt");
			int i = 0;
			while ((i=fin.read())!=-1) {
			System.out.println((char)i);
			}
			fin.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
