package com.java.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author Sonam_Mittal
 * File creation and deletion using Paths in nio
 */

public class FileDeleteWithPaths {

	public static void main(String[] args) {

		try {
			
			Files.createFile(Paths.get(System.getProperty("user.dir") + "/file_test3.txt"));
			Path fileToDeletePath = Paths.get(System.getProperty("user.dir") + "/file_test3.txt");
			Files.delete(fileToDeletePath);
			
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
}
