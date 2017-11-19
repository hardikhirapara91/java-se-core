package com.hardik.javase;

import java.io.File;

/**
 * List Files
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class ListFiles {

	public static void main(String[] args) {

		File file = null;
		File[] paths;

		// FIRST METHOD TO GET ALL FILES
		try {
			// create new file
			file = new File("E:\\Hardik\\temp");

			// returns pathnames for files and directory
			paths = file.listFiles();

			// for each pathname in pathname array
			for (File path : paths) {
				System.out.println(path);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		// SECOND METHOD TO GET FILES
		try {
			// create new file
			file = new File("E:\\Hardik\\temp");
			String[] files = file.list();

			for (String f : files) {
				System.out.println(f);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
