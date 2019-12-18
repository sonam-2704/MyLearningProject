package com.java.file;

import java.io.File;
import java.io.IOException;

/**
 * @author Sonam_Mittal
 * Deleting file using delete() method
 */

public class FileDelete1 {

	public static void main(String[] args) {

		File file = new File(System.getProperty("user.dir") + "/file_test2.txt");
		Boolean flag = false ;
		
		if(file.exists())
			System.out.println("File exists");
		else{
			System.out.println("File does not exists");
			System.out.println("Creating file");
			try {
				Boolean createFileFlag = file.createNewFile();
				if(createFileFlag)
					System.out.println("File created successfully");
				flag = file.delete();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		if(flag)			
			System.out.println("File deleted successfully");
		else
			System.out.println("File deletion failed");
	}
}
