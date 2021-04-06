package advanced.io;

import java.io.File;

public class FilesExamples {
	
	public static void main(String[] args) {
		
		File file = new File("/home/daredevil/dxc/dxc_java/src/advanced/io");
		
		String[] directories;
		
		directories = file.list();
		
		for (String path: directories) {
			System.out.println(path);
		}
		
		
		file.mkdir();		
		
	}

}
