package com.java.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * @author Sonam_Mittal 
 * Reading the whole file in a List using Paths
 */

public class ReadFileIntoList {

	public static List<String> readFileInList(String fileName) {

		List<String> lines = Collections.emptyList();

		try {
			lines = Files.readAllLines(Paths.get(fileName));
		} catch (IOException e) {
			e.printStackTrace();
		}

		return lines;

	}

	public static void main(String[] args) {

		String fileName = System.getProperty("user.dir") + "/file_test.txt";

		List<String> l = readFileInList(fileName);

		Iterator<String> itr = l.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
