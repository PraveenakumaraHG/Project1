package file.main;

import java.io.File;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.Scanner;

import file.curd.operation.FileCreate;
import file.curd.operation.FileDelete;
import file.curd.operation.FileRetrive;
import file.curd.operation.FileSearch;
import file.curd.operation.FileWriting;

public class FileMainMethod {
	public static void main(String[] args) throws Exception {
		
		System.out.println("Application Name: "+" Company Lockers Pvt. Ltd. \n" );
		System.out.println("Developer Name: Praveenakumara H G \n");
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println(" 1.Retrive all File in assending order \n 2.Business-level operations \n 3.Close the Application");
			System.out.println("Enter the number you want");
			int sNo = sc.nextInt();
			do {
				if(sNo==1) {
					FileRetrive fr = new FileRetrive();
					FileRetrive.Retrive();
					break;
				}
				if (sNo==2) {
					System.out.println(" a.Add or Create New File \n b.Delete File \n c.Serach File \n d.Back to Main Menu");
					System.out.println("Enter any one of the characte shown in the above");
					String ch = sc.next();
					do {
						if(ch.equals("a")) {
							FileCreate fc = new FileCreate();
							fc.create();
							break;
						}else if(ch.equals("b")) {
							FileDelete fd = new  FileDelete();
							fd.delete();
							break;
						}else if(ch.equals("c")) {
							FileSearch fs = new FileSearch();
							fs.search();
							break;
						}
						
					}while(ch.equals("a")|| ch.equals("b") || ch.equals("c"));
					if(ch.equals("d")) {
						System.out.println(" 1.Retrive all File in assending order \n 2.Business-level operations \n 3.Close the Application");
						System.out.println("Enter the number you want");
						int sNo1 = sc.nextInt();
						break;
					}
				}	
			}while(sNo==1 || sNo==2);
			if(sNo==3) {
				System.out.println("Close the Application");
				break;
			}
			
				//sNo ending line	
		}
		
	}
		

}
