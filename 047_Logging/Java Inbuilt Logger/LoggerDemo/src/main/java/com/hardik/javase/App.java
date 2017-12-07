package com.hardik.javase;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

/**
 * Java Logger Demo
 *
 * @author HARDIK HIRAPARA
 */
public class App {

	static Logger logger = Logger.getLogger(App.class.getName());

	/**
	 * Application Main Method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			LogManager.getLogManager().readConfiguration(new FileInputStream("src/main/resources/log.properties"));
		} catch (SecurityException | IOException ex) {
			ex.printStackTrace();
		}

		logger.setLevel(Level.FINE); // LEVEL
		logger.addHandler(new ConsoleHandler()); // HANDLER

		try {
			// FileHandler file name with max size and number of log files limit
			Handler fileHandler = new FileHandler("/tmp/app.log", 2000, 5);
			logger.addHandler(fileHandler);

			// logging messages
			for (int i = 0; i < 1000; i++) {
				logger.log(Level.INFO, "Msg" + i);
			}

			logger.log(Level.CONFIG, "Config data");
		} catch (SecurityException | IOException ex) {
			ex.printStackTrace();
		}
	}
}
