package file.curd.operation;

import java.io.File;
import java.util.Scanner;

public class FileCreate {
	public void create() throws Exception{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter File Name : ");
		String fname = sc.next();
		File  fileObj = new File("C:\\SIMPLI L_PR1\\" + fname);
		
		if(fileObj.exists()==true)
		{
			System.out.println("File Already Exist");
		}
		else
		{
			fileObj.createNewFile();
			System.out.println("File Created....");
		}
			
	}
}