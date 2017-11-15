package com.hardik.javase;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

/**
 * PrintStream class example
 * 
 * The PrintStream class provides methods to write data to another stream. The
 * PrintStream class automatically flushes the data so there is no need to call
 * flush() method. Moreover, its methods don't throw IOException.
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class App {

	/**
	 * App Main Method
	 * 
	 * @param args
	 * @throws FileNotFoundException
	 */
	public static void main(String[] args) throws FileNotFoundException {

		OutputStream outputStream = new FileOutputStream("/tmp/abc.txt");
		PrintStream printStream = new PrintStream(outputStream);

		printStream.println(2016);
		printStream.println("Hello Java");
		printStream.println("Welcome to Java");

		printStream.close();
		printStream.close();

		System.out.println("Success?");
	}

}
