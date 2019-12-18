package com.java.file;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Sonam_Mittal 
 * Read from file using FileReader
 */

public class ReadingFromFile1 {

	public static void main(String[] args) {

		try {
			FileReader fileReader = new FileReader(System.getProperty("user.dir") + "/file_test.txt");
			int i;

			while ((i = fileReader.read()) != -1) {
				System.out.print((char) i);
			}

			fileReader.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
