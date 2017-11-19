package com.hardik.javase;

import java.io.File;
import java.io.IOException;

/**
 * Check file is exist using File class example
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class FileOperations {

	/**
	 * App Main Method
	 * 
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {

		File file = new File("E:\\Hardik\\temp\\abc.txt");

		if (file.exists()) {
			System.out.println("File exist...");
		} else {
			System.out.println("File doesn't exist.");
		}

		System.out.println("Is File: " + file.isFile());
		System.out.println("Is Directory: " + file.isDirectory());
		System.out.println("Is Absolute: " + file.isAbsolute());
		System.out.println("Name: " + file.getName());
		System.out.println("Absolute Path: " + file.getAbsolutePath());
		System.out.println("Parent: " + file.getParent());
		System.out.println("Free Space: " + file.getFreeSpace());
		System.out.println("Canonical File: " + file.getCanonicalFile());
		System.out.println("Canonical Path: " + file.getCanonicalPath());
		System.out.println("Is Hidden File?: " + file.isHidden());
	}
}
