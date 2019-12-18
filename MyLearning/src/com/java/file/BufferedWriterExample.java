package com.java.file;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Sonam_Mittal Writing to a file using BufferedWriter
 *
 */

public class BufferedWriterExample {

	public static void main(String[] args) {

		FileWriter writer;
		try {
			writer = new FileWriter(System.getProperty("user.dir") + "/file_test1.txt");
			BufferedWriter bw = new BufferedWriter(writer);

			bw.write("Writing in file using BufferedWriter");

			bw.close();

			System.out.println("Success");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
