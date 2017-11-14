package com.hardik.javase;

/**
 * How to detect OS using System class
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class App {

	public static String operatingSystemName = System.getProperty("os.name").toLowerCase();

	/**
	 * App Main Method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Detected OS: " + operatingSystemName);

		if (isWindows()) {
			System.out.println("This is Windows");
		} else if (isMac()) {
			System.out.println("This is Mac");
		} else if (isUnix()) {
			System.out.println("This is Unix or Linux");
		} else if (isSolaris()) {
			System.out.println("This is Solaris");
		} else {
			System.out.println("Your OS is not support!!");
		}
	}

	/**
	 * Check OS is Windows
	 * 
	 * @return
	 */
	public static boolean isWindows() {
		return (operatingSystemName.indexOf("win") >= 0);
	}

	/**
	 * Check OS is Linux or Unix
	 * 
	 * @return
	 */
	public static boolean isUnix() {
		return (operatingSystemName.indexOf("nux") >= 0 || operatingSystemName.indexOf("nix") >= 0
				|| operatingSystemName.indexOf("aux") >= 0);
	}

	/**
	 * Check OS is Mac
	 * 
	 * @return
	 */
	public static boolean isMac() {
		return (operatingSystemName.indexOf("mac") >= 0);
	}

	/**
	 * Check OS is Solaris
	 * 
	 * @return
	 */
	public static boolean isSolaris() {
		return (operatingSystemName.indexOf("sunos") >= 0);
	}
}
