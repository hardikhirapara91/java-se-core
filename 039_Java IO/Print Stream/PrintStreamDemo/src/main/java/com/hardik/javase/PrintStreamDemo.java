package com.hardik.javase;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

/**
 * PrintStream Class Example
 * 
 * The PrintStream class provides methods to write data to another stream. The
 * PrintStream class automatically flushes the data so there is no need to call
 * flush() method. Moreover, its methods don't throw IOException.
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class PrintStreamDemo {
	/**
	 * Application Main Method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		FileOutputStream fout = null;

		try {
			fout = new FileOutputStream("/tmp/mfile.txt");
			PrintStream pout = new PrintStream(fout);

			pout.println(1900);
			pout.println("Hello Java");
			pout.println("Welcome to Java");

			pout.close();

			System.out.println("Success!");
		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
		} finally {
			try {
				if (fout != null)
					fout.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}
}
