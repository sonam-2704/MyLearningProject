package com.java.file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Sonam_Mittal 
 * Reading the file with try with resources
 */

public class ReadingFromFile3 {

	public static void main(String[] args) {

		try (FileReader fileReader = new FileReader(System.getProperty("user.dir") + "/file_test.txt");
				BufferedReader br = new BufferedReader(fileReader);) {

			String st;

			while ((st = br.readLine()) != null) {
				System.out.println(st);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
