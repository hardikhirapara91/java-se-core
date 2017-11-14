package com.hardik.javase;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

/**
 * Write UTF-8 encoded Data into File
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class App {
	/**
	 * App Main Method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		OutputStream outputStream = null;
		Writer outputStreamWriter = null, buffered = null;

		try {
			outputStream = new FileOutputStream("/tmp/aaa.txt");
			outputStreamWriter = new OutputStreamWriter(outputStream, "UTF-8");
			buffered = new BufferedWriter(outputStreamWriter);

			// WRITE
			buffered.append("Website UTF-8").append("\r\n");
			buffered.append("?? UTF-8").append("\r\n");
			buffered.append("??????? UTF-8").append("\r\n");

			// FLUSH
			outputStream.flush();
			outputStreamWriter.flush();
			buffered.flush();

			System.out.println("Success!");
		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			try {
				if (outputStream != null)
					outputStream.close();
				if (outputStreamWriter != null)
					outputStreamWriter.close();
				if (buffered != null)
					buffered.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}
}
