package file.curd.operation;

import java.io.File;
import java.util.Arrays;

public class FileRetrive {
	
	public static void Retrive() {
		File fInfo = null;
		String path = "C:\\SIMPLI L_PR1";
		File file = new File (path);
		File SIMPLIL_PR1[] = file.listFiles();
		Arrays.sort(SIMPLIL_PR1);
		for(File e:SIMPLIL_PR1) {
			if(e.isFile()) {
				System.out.println("File: " + e.getName());
			}else if (e.isDirectory()) {
				System.out.println("Folder: "+ e.getName());
			}
			else {
				System.out.println("Not known :" + e.getName());
			}
		}
	}

}
