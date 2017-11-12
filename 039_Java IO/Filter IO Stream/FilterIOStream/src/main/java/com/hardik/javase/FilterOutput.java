package com.hardik.javase;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * Java FilterOutputStream Class
 * 
 * Java FilterOutputStream class implements the OutputStream class. It provides
 * different sub classes such as BufferedOutputStream and DataOutputStream to
 * provide additional functionality. So it is less used individually.
 * 
 * @author HARDIK HIRAPARA
 */
public class FilterOutput {
	/**
	 * App Main Method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		OutputStream outputStream = null;
		FilterOutputStream filterOutputStream = null;

		try {
			outputStream = new FileOutputStream("E:\\Hardik\\temp\\abc.txt");
			filterOutputStream = new FilterOutputStream(filterOutputStream);

			String output = "Hello World!";
			filterOutputStream.write(output.getBytes());

			filterOutputStream.flush();
			outputStream.flush();

			System.out.println("Success!");
		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			try {
				if (filterOutputStream != null)
					filterOutputStream.close();
				if (outputStream != null)
					outputStream.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}
}
