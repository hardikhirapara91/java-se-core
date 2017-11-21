package com.hardik.javase;

import java.io.File;
import java.io.IOException;

/**
 * Create New File
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class CreateNewFile {

	public static void main(String[] args) {

		try {
			File file = new File("D:\\foo.txt");
			if (file.createNewFile()) {
				System.out.println("New File is created!");
			} else {
				System.out.println("File already exists.");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
