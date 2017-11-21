package com.hardik.javase;

import java.io.File;

/**
 * Create Temp File
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class CreateTempFile {
	/**
	 * Application Main Method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		File file = null;

		try {
			// creates temporary file
			file = File.createTempFile("tmp", ".txt", new File("D:/"));

			// prints absolute path
			System.out.println("File path: " + file.getAbsolutePath());

			// deletes file when the virtual machine terminate
			file.deleteOnExit();

			// creates temporary file
			file = File.createTempFile("tmp", null, new File("D:/"));

			// prints absolute path
			System.out.print("File path: " + file.getAbsolutePath());

			// deletes file when the virtual machine terminate
			file.deleteOnExit();

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
