package com.hardik.javase;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * Java Byte Array Input/Output Example
 * 
 * Java ByteArrayOutputStream class is used to write common data into multiple
 * files.
 * 
 * @author HARDIK HIRAPARA
 */
public class Output {
	/**
	 * App Main method
	 * 
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) {
		String writeString = "Hello World! How are you?";

		try (OutputStream file1 = new FileOutputStream("/tmp/file1.txt");
				OutputStream file2 = new FileOutputStream("/tmp/file2.txt");
				ByteArrayOutputStream byteArrayOStream = new ByteArrayOutputStream();) {

			byteArrayOStream.write(writeString.getBytes());
			byteArrayOStream.writeTo(file1);
			byteArrayOStream.writeTo(file2);
			byteArrayOStream.flush();

			System.out.println("Done.");
		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
}
