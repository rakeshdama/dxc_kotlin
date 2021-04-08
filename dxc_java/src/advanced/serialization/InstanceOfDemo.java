package advanced.serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class InstanceOfDemo {

	public static void main(String[] args) throws Exception {
	
		FileInputStream fis = new FileInputStream("animals.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Object o = ois.readObject();
		
		ois.close();
		
		if ( o instanceof Cat) {
			Cat c1 = (Cat)o;
			System.out.println(c1.k);
		}
		else if ( o instanceof Dog) {
			Dog d1 = (Dog)o;
			System.out.println(d1.i);
		}
		else if ( o instanceof Rat) {
			Rat r1 = (Rat)o;
			System.out.println(r1.a);
		}
	}

}