package advanced.collections;

import java.io.FileReader;
import java.util.Properties;

public class TestProperties {
	
	public static void main(String[] args) {
		Properties p = null ;
		
		try {
			FileReader reader = new FileReader("/home/daredevil/dxc/dxc_java/src/advanced/collections/db.properties");
			p = new Properties();
			p.load(reader);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(p.getProperty("username"));
		System.out.println(p.getProperty("Password"));
	}

}
