package file.curd.operation;

import java.io.File;
import java.util.Scanner;

public class FileDelete {
	
	public void delete() throws Exception{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter File Name to delete : ");
		String path = "C:\\SIMPLI L_PR1\\";
		String fname = sc.next();
		File  fileObj = new File(path + fname);
		
		if(fileObj.exists()==true)
		{
			fileObj.delete();
			System.out.println("File deleted");
		}
		else
		{
			System.out.println("File Not Found....");
		}
	}

}
