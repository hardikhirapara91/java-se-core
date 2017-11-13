package com.hardik.javase;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 * BufferedReader Class Example
 * 
 * Java BufferedReader class is used to read the text from a character-based
 * input stream. It can be used to read data line by line by readLine() method.
 * It makes the performance fast. It inherits Reader class.
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class BufferedReaderDemo {
	/**
	 * App Main Method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Reader reader = null, bufferedReader = null;

		try {
			reader = new FileReader("E:\\Hardik\\temp\\temp.txt");
			bufferedReader = new BufferedReader(reader);

			int i = 0;
			while ((i = bufferedReader.read()) != -1) {
				System.out.print((char) i);
			}
		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			try {
				if (bufferedReader != null)
					bufferedReader.close();
				if (reader != null)
					reader.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}
}
