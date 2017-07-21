package com.hardik.logging;

import org.apache.log4j.Logger;

/**
 * Example Class
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class Example1 {

	final static Logger LOGGER = Logger.getLogger(Example1.class);

	/**
	 * Check Logging Status
	 */
	public void checkLoggingStatus() {
		System.out.println("Degug Enable: " + LOGGER.isDebugEnabled());
		System.out.println("Info Enable: " + LOGGER.isInfoEnabled());
		System.out.println("Trace Enable: " + LOGGER.isTraceEnabled());
	}

	public void printLog() {

		// DEBUG
		LOGGER.debug("This is debug message.");

		// INFO
		LOGGER.info("This is info message.");

		// TRACE
		LOGGER.trace("This is trace message.");

		// WARNING
		LOGGER.warn("This is warning message.");

		// FATAL
		LOGGER.fatal("This is fatal message.");

		// ERROR
		LOGGER.error("This is error message", new ArithmeticException("/ by 0"));
	}

	public static void main(String[] args) {
		Example1 ex1 = new Example1();
		// ex1.checkLoggingStatus();
		ex1.printLog();
	}
}
