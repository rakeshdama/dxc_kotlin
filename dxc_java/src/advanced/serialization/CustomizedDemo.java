package advanced.serialization;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class CustomizedDemo implements Serializable {
	
	String userName = "Rakesh";
	transient String Password = "Dama" ;
	
	private void writeObject(ObjectOutputStream oos) throws IOException {
		
		oos.writeUTF("123"+userName+","+"456"+Password);
		
	}
	
	private void readObject(ObjectInputStream ois) throws IOException {
		
		String[] unPwd = ois.readUTF().split(",");
		this.userName = unPwd[0].substring(3);
		this.Password = unPwd[1].substring(3);
		
	}

}
