package com.hardik.javase;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * Java Byte Array Example
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class ByteArrayDemo {

	public static void main(String[] args) {

		OutputStream file1 = null, file2 = null;
		InputStream file3 = null;

		try {
			file1 = new FileOutputStream("/tmp/file1.txt");
			file2 = new FileOutputStream("/tmp/file2.txt");

			ByteArrayOutputStream baos = new ByteArrayOutputStream();

			baos.write(65);
			baos.write(66);
			baos.write(67);
			baos.write(68);

			System.out.println(baos);

			baos.writeTo(file1);
			baos.writeTo(file2);

			// Read into file
			file3 = new FileInputStream("/tmp/file1.txt");

			int i;
			while ((i = file3.read()) != -1) {
				System.out.print((char) i);
			}
		} catch (IOException ex) {
			System.out.println("Exception: " + ex.getMessage());
		} finally {
			try {
				file1.close();
				file2.close();
				file3.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
