package com.java.file;

import java.io.File;

/**
 * @author Sonam_Mittal
 * Check file permissions and change it
 */

public class FilePermissions {

	public static void main(String[] args) {

		File file = new File(System.getProperty("user.dir") + "/file_test.txt");

		System.out.println("Before changing file permissions");
		
		if(file.exists()){
			
			System.out.println("Can execute: "+file.canExecute());
			System.out.println("Can read: "+file.canRead());
			System.out.println("Can write: "+file.canWrite());
			
		}
		
		//Changing file permissions

		file.setExecutable(false);
		file.setReadable(false);
		file.setWritable(false);
		
		//After changing file permissions
		
		System.out.println("After changing file permissions");
		System.out.println("Can execute: "+file.canExecute());
		System.out.println("Can read: "+file.canRead());
		System.out.println("Can write: "+file.canWrite());
	}

}
