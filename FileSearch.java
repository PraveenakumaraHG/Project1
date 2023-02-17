package file.curd.operation;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileSearch {
	
	public void search() throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the file Name Search :");
		String fName = sc.next();
		String path = "C:\\SIMPLI L_PR1";
		File fl = new File (path);
		boolean b=false;
		for (String flName : fl.list()) {
			if(flName.equalsIgnoreCase(fName)) {
				System.out.println("\n" + flName +  "File is exists");
				b = true;
				break;
			}
		}
		if(b==false)
			System.out.println("File is Not Found....");
	}
	
}