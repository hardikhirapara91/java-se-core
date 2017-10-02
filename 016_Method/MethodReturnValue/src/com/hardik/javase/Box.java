package com.hardik.javase;

/**
 * Box Class
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class Box {

	private double width;
	private double height;
	private double depth;

	// Set box width, height and depth
	public void setVolumeData(double width, double height, double depth) {
		this.width = width;
		this.height = height;
		this.depth = depth;
	}

	// Return Box-Volume
	public double getVolume() {
		return (this.width * this.height * this.depth);
	}
}
