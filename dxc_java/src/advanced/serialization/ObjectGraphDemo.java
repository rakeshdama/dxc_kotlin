package advanced.serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ObjectGraphDemo {
	
	public static void main(String[] args) throws Exception{
		
		Rat r1 = new Rat();
		
		FileOutputStream fos = new FileOutputStream("animals.txt");
		
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(r1);
		
		oos.close();
		
		System.out.println(r1);
		System.out.println(r1.cat);
		System.out.println(r1.cat.dog);
		
	}

}
