package com.hardik.javase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * Java File IO Demo
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class FileIODemo2 {

	public static void main(String[] args) {

		try (InputStream inputStream = new FileInputStream("/tmp/111.txt");
				OutputStream outputStream = new FileOutputStream("/tmp/222.txt")) {

			// Read 111.txt file and then write it to 222.txt file
			int i;
			while ((i = inputStream.read()) != -1) {
				outputStream.write(i);
			}
			System.out.println("Done.");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
