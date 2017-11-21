package com.hardik.javase;

import java.io.File;

/**
 * Check - File is readable, executable and writable
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class CanReadWrightExecute {

	public static void main(String[] args) {

		File file = new File("C:\\Windows\\System32\\notepad.exe");

		// check first if file exists
		if (file.exists()) {

			// check if file can be execute
			if (file.canRead()) {
				System.out.println("user have permission to read the file");
			} else {
				System.out.println("File cannot be read");
			}

			if (file.canWrite()) {
				System.out.println("user have permission to wright the file");
			} else {
				System.out.println("File cannot be write");
			}

			if (file.canExecute()) {
				System.out.println("user have permission to execute the file");
			} else {
				System.out.println("File cannot be execute");
			}
		} else {
			System.out.println("File does not exists");
		}

	}
}
