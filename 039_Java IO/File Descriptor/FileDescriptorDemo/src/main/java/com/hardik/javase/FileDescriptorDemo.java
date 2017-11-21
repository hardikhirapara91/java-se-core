package com.hardik.javase;

import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * FileDescriptor Class Example
 * 
 * FileDescriptor class serves as an handle to the underlying machine-specific
 * structure representing an open file, an open socket, or another source or
 * sink of bytes. The handle can be err, in or out.
 * 
 * The FileDescriptor class is used to create a FileInputStream or
 * FileOutputStream to contain it.
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class FileDescriptorDemo {
	/**
	 * Application Main Method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		byte[] b = { 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58 };

		FileDescriptor fileDescriptor = null;
		FileOutputStream fOutputStream = null;
		FileInputStream fInputStream = null;

		try {
			fOutputStream = new FileOutputStream("/tmp/abc.txt"); // WRITE
			fInputStream = new FileInputStream("/tmp/abc.txt"); // READ

			fileDescriptor = fOutputStream.getFD();
			fOutputStream.write(b);

			fOutputStream.flush();
			fileDescriptor.sync(); // For every available bytes

			int value;
			while ((value = fInputStream.read()) != -1) {
				char c = (char) value;// converts bytes to char
				System.out.print(c);
			}
			System.out.println("\nSync() successfully executed!!");
		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			try {
				if (fOutputStream != null)
					fOutputStream.close();
				if (fInputStream != null)
					fInputStream.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}
}
