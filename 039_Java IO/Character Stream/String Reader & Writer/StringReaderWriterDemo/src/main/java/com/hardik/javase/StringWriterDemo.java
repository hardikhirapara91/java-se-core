package com.hardik.javase;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringWriter;

/**
 * StringWriter class example
 * 
 * Java StringWriter class is a character stream that collects output from
 * string buffer, which can be used to construct a string. The StringWriter
 * class inherits the Writer class.
 * 
 * In StringWriter class, system resources like network sockets and files are
 * not used, therefore closing the StringWriter is not necessary.
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class StringWriterDemo {
	/**
	 * Application Main Method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		char[] charArr = new char[1024];

		StringWriter writer = new StringWriter();

		InputStream inputStream = null;
		Reader bufferedReader = null;

		try {
			inputStream = new FileInputStream("/tmp/foo.txt");
			bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));

			int x;
			while ((x = bufferedReader.read()) != -1) {
				writer.write(charArr, 0, x);
			}

			writer.flush();
			System.out.println(writer.toString());
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			try {
				if (inputStream != null)
					inputStream.close();
				if (bufferedReader != null)
					bufferedReader.close();
				if (writer != null)
					writer.close();
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}
}
