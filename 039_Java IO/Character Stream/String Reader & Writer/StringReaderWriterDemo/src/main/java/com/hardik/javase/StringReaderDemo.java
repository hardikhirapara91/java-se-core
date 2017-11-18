package com.hardik.javase;

import java.io.IOException;
import java.io.StringReader;

/**
 * StringReader class example
 * 
 * Java StringReader class is a character stream with string as a source. It
 * takes an input string and changes it into character stream. It inherits
 * Reader class.
 * 
 * In StringReader class, system resources like network sockets and files are
 * not used, therefore closing the StringReader is not necessary.
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class StringReaderDemo {
	/**
	 * Application Main Method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		String srg = "Hello Java!! \nHello World!.";
		StringReader reader = new StringReader(srg);

		try {
			int k = 0;

			while ((k = reader.read()) != -1) {
				System.out.print((char) k);
			}
		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			if (reader != null)
				reader.close();
		}
	}
}
