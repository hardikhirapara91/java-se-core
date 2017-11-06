package com.hardik.javase;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Start Browser using Java Code
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class StartBrowser {

	/**
	 * App Main Method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		String url = "https://www.google.com";
		String os = System.getProperty("os.name").toLowerCase();
		Runtime runtime = Runtime.getRuntime();

		try {
			// Check OS
			if (os.indexOf("win") >= 0) {
				// this doesn't support showing urls in the form of
				// "page.html#nameLink"
				runtime.exec("rundll32 url.dll,FileProtocolHandler " + url);
			} else if (os.indexOf("mac") >= 0) {
				runtime.exec("open " + url);
			} else if (os.indexOf("nix") >= 0 || os.indexOf("nux") >= 0) {

				// Do a best guess on unix until we get a platform independent
				// way
				// Build a list of browsers to try, in this order.
				String[] browsers = { "epiphany", "firefox", "mozilla", "konqueror", "netscape", "opera", "links",
						"lynx" };

				// Build a command string which looks like "browser1 "url" ||
				// browser2 "url" ||..."
				StringBuffer cmd = new StringBuffer();
				for (int i = 0; i < browsers.length; i++)
					cmd.append((i == 0 ? "" : " || ") + browsers[i] + " \"" + url + "\" ");

				runtime.exec(new String[] { "sh", "-c", cmd.toString() });

			} else {
				return;
			}
		} catch (Exception ex) {
			Logger.getLogger(StartBrowser.class.getName()).log(Level.WARNING, "Exception | ", ex);
		}
	}
}
