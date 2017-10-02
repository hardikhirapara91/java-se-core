package com.hardik.javase;

/**
 * Bank Class
 * @author HARDIK HIRAPARA
 *
 */
class Bank {
	public void rateOfInterest() {
		System.out.println("Rate of Interest Not Possible.");
	}
}

/**
 * BOB Class
 * @author HARDIK HIRAPARA
 *
 */
class BOB extends Bank {
	
	private double rate;
	
	public BOB(double rate) {
		this.rate = rate;
	}
	
	@Override
	public void rateOfInterest() {
		System.out.println("BOB Bank (Rate of Interest): " + this.rate);
	}
}

/**
 * SBI Class
 * @author HARDIK HIRAPARA
 *
 */
class SBI extends Bank {
	
	private double rate;
	
	public SBI(double rate) {
		this.rate = rate;
	}
	
	@Override
	public void rateOfInterest() {
		System.out.println("SBI Bank (Rate of Interest): " + this.rate);
	}
}

/**
 * ICICI Class
 * @author HARDIK HIRAPARA
 *
 */
class ICICI extends Bank {
	
	private double rate;
	
	public ICICI(double rate) {
		this.rate = rate;
	}
	
	@Override
	public void rateOfInterest() {
		System.out.println("ICICI Bank (Rate of Interest): " + this.rate);
	}
}

/**
 * Student Class
 * @author HARDIK HIRAPARA
 *
 */
public class Demo3 {

	public static void main(String[] args) {
		
		Bank bank = new Bank();
		BOB bob = new BOB(12.00);
		SBI sbi = new SBI(10.00);
		ICICI icici = new ICICI(15.00);
		
		bank.rateOfInterest();
		
		bank = bob;
		bank.rateOfInterest();
		
		bank = sbi;
		bank.rateOfInterest();
		
		bank = icici;
		bank.rateOfInterest();

	}
}
