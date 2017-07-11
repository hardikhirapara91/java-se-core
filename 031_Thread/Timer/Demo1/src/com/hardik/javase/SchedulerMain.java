package com.hardik.javase;

import java.util.Timer;

/**
 * Scheduler Main Class
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class SchedulerMain {

	public static void main(String[] args) throws InterruptedException {

		Timer timer = new Timer(); // Instantiate Timer Object
		TimerTask tt = new TimerTask(); // Instantiate SheduledTask class

		// Create Repetitively task for every 1 second
		timer.schedule(tt, 0, 1000);

		// For Demo Only
		for (int i = 0; i <= 5; i++) {
			System.out.println("Execution in Main Thread...." + i);
			Thread.sleep(2000);

			if (i == 5) {
				System.out.println("Application Terminates");
				System.exit(0);
			}
		}
	}
}
