package com.hardik.javase;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 * Reader Class Example
 * 
 * Java FileReader class is used to read data from the file. It returns data in
 * byte format like FileInputStream class.
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class ReaderDemo {
	/**
	 * App Main Method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Reader reader = null;

		try {
			reader = new FileReader("E:\\Hardik\\temp\\temp.txt");

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
