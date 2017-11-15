package com.hardik.javase;

import java.io.File;
import java.io.FileNotFoundException;

/**
 * Check file is exist using File class example
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class App {

	/**
	 * App Main Method
	 * 
	 * @param args
	 * @throws FileNotFoundException
	 */
	public static void main(String[] args) throws FileNotFoundException {

		File file = new File("/tmp/foo.txt");

		if (file.exists()) {
			System.out.println("File exist...");
		} else {
			System.out.println("File doesn't exist.");
		}
	}
}
