package advanced.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/*
 * Serialization is a process of converting an object from java supported format to file supproted format
 * writing a state of object to file is serialization.
 * 
 * De - Serialization ==> FileInputStream -> ObjectInputStream
 * 
 * 
 */

public class DemoSerialization {
	
	public static void main(String[] args) {
		
			Dog d1 = new Dog();
			
			try {
				FileOutputStream fos = new FileOutputStream("dxc.txt");
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				
				oos.writeObject(d1);
				oos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			FileInputStream fis;
			
			try {
				fis = new FileInputStream("dxc.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Dog d2 = (Dog)ois.readObject();
			ois.close();
			System.out.println(d2.i+"\t"+d2.j);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}
	
	
	

}
