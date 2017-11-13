package com.hardik.javase;

import java.io.CharArrayReader;
import java.io.IOException;
import java.io.Reader;

/**
 * BufferedReader Class Example
 * 
 * The CharArrayReader is composed of two words: CharArray and Reader. The
 * CharArrayReader class is used to read character array as a reader (stream).
 * It inherits Reader class.
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class CharArrayReaderDemo {
	/**
	 * App Main Method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		char[] input = { 'J', 'A', 'V', 'A' };
		Reader reader = null;

		try {
			reader = new CharArrayReader(input);

			int i = 0;
			while ((i = reader.read()) != -1) {
				System.out.print((char) i);
			}
		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			try {
				if (reader != null)
					reader.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}
}
