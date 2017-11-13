package com.hardik.javase;

import java.io.CharArrayWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * CharArrayWriter Class Example
 * 
 * The CharArrayWriter class can be used to write common data to multiple files.
 * This class inherits Writer class. Its buffer automatically grows when data is
 * written in this stream. Calling the close() method on this object has no
 * effect.
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class CharArrayWriterDemo {
	/**
	 * App Main Method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Writer file1 = null, file2 = null, file3 = null;
		CharArrayWriter charArrayWriter = null;

		try {
			file1 = new FileWriter("E:\\Hardik\\temp\\temp1.txt");
			file2 = new FileWriter("E:\\Hardik\\temp\\temp2.txt");
			file3 = new FileWriter("E:\\Hardik\\temp\\temp3.txt");

			charArrayWriter = new CharArrayWriter();

			charArrayWriter.write("Hello World! How are you?");

			charArrayWriter.writeTo(file1);
			charArrayWriter.writeTo(file2);
			charArrayWriter.writeTo(file3);

			file1.flush();
			file2.flush();
			file3.flush();
			charArrayWriter.flush();

			System.out.println("Success!");
		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			try {
				if (file1 != null)
					file1.close();
				if (file2 != null)
					file2.close();
				if (file3 != null)
					file3.close();
				if (charArrayWriter != null)
					charArrayWriter.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}
}
