package com.java.file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Sonam_Mittal 
 * Read from file using BufferredReader
 */

public class ReadingFromFile2 {

	public static void main(String[] args) {

		try {
			FileReader fileReader = new FileReader(System.getProperty("user.dir") + "/file_test.txt");
			BufferedReader br = new BufferedReader(fileReader);
			String st;
			
			while ((st = br.readLine()) != null) {
				System.out.println(st);
			}
			
			fileReader.close();
			br.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
