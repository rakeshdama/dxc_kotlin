package advanced.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationInheritanceDemo {

	private static final String FILE_NAME = "Inheritance.txt";

	public static void main(String[] args) throws Exception {
		
		Rabbit rabbit = new Rabbit();
		rabbit.i = 123 ;
		rabbit.j = 234 ;
		rabbit.k = 345 ;
		
		FileOutputStream fos = new FileOutputStream(FILE_NAME);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(rabbit);
		oos.close();
		
		FileInputStream fis = new FileInputStream(FILE_NAME);
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Rabbit rabbit2 = (Rabbit) ois.readObject();
		
		ois.close();
		
		System.out.println("rabbits variables i = "+rabbit2.i+" j = "+rabbit2.j+" k = "+rabbit2.k);
		

	}

}
