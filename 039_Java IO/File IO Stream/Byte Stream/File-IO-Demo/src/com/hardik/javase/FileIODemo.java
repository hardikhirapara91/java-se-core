package com.hardik.javase;

import java.io.FileInputStream;
import java.io.InputStream;

/**
 * File Input Stream Demo
 * 
 * Try with resources there is no need to close file manually.
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class FileIODemo {

	public static void main(String[] args) {

		try (InputStream inputStream = new FileInputStream("/tmp/test.txt")) {
			int i;
			while ((i = inputStream.read()) != -1) {
				System.out.println((char) i);
			}
		} catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
		}
	}
}
