package com.hardik.javase;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * BufferedWriter Class Example
 * 
 * Java BufferedWriter class is used to provide buffering for Writer instances.
 * It makes the performance fast. It inherits Writer class. The buffering
 * characters are used for providing the efficient writing of single arrays,
 * characters, and strings.
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class BufferedWriterDemo {
	/**
	 * App Main Method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Writer writer = null;
		BufferedWriter bufferedWriter = null;

		try {
			writer = new FileWriter("E:\\Hardik\\temp\\temp.txt");
			bufferedWriter = new BufferedWriter(writer);

			bufferedWriter.write("I love India.");
			bufferedWriter.flush();
			writer.flush();

			System.out.println("Success!");
		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			try {
				if (bufferedWriter != null)
					bufferedWriter.close();
				if (writer != null)
					writer.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}
}
