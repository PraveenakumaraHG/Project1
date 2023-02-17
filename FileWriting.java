package file.curd.operation;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.util.Scanner;

public class FileWriting {
	
	public void write() throws Exception {
		
			FileWriter fw = null;
			try
			{
			fw = new FileWriter("C:\\SIMPLI L_PR1\\abc2.txt", true);
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter some text ");
			String str = sc.nextLine();
			str = str+"\n";
			fw.write(str);
			System.out.println("File Created Successfully...");
			}
			catch(Exception ex)
			{
				System.out.println(ex);
			}
			finally
			{
					{
						fw.close();	
			
					}		
			}
	}
	
}
