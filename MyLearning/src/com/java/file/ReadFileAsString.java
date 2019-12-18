package com.java.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * @author Sonam_Mittal 
 * Reading the whole file into String using Paths
 */

public class ReadFileAsString {

	public static String readFileInList(String fileName) {

		String str = null;

		try {
			str = new String(Files.readAllBytes(Paths.get(fileName)));
		} catch (IOException e) {
			e.printStackTrace();
		}

		return str;

	}

	public static void main(String[] args) {

		String fileName = System.getProperty("user.dir") + "/file_test.txt";

		String str = readFileInList(fileName);

		System.out.println(str);

	}
}
