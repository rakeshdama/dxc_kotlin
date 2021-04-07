package advanced.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Cutomized {
	
	public static void main(String[] args) throws Exception{
		
		CustomizedDemo account = new CustomizedDemo();
		
		FileOutputStream fos = new FileOutputStream("accounts.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(account);
		oos.close();
		
		FileInputStream fis = new FileInputStream("accounts.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		CustomizedDemo account2 = (CustomizedDemo) ois.readObject();
		
		ois.close();
		
		System.out.println("Username = "+account2.userName+" password = "+account2.Password);
		
		
	}

}
