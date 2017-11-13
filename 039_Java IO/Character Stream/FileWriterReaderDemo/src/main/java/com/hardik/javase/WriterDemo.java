package com.hardik.javase;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * Writer Class Example
 * 
 * Java FileWriter class is used to write character-oriented data to a file. It
 * is character-oriented class which is used for file handling in java.
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class WriterDemo {
	/**
	 * App Main Method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Writer writer = null;

		try {
			writer = new FileWriter("E:\\Hardik\\temp\\temp.txt");
			writer.write("I love India.");
			writer.flush();
			System.out.println("Success!");
		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			try {
				if (writer != null)
					writer.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}
}
