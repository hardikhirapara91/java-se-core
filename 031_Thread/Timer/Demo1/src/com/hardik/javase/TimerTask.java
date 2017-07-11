package com.hardik.javase;

import java.util.Date;

/**
 * TimerTask Class
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class TimerTask extends java.util.TimerTask {

	@Override
	public void run() {
		System.out.println("Date: " + new Date());
	}
}
