package com.hardik.javase;

/**
 * Point Class
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class Point {

	int x;
	int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;

		if (!(obj instanceof Point))
			return false;

		Point point = (Point) obj;

		if (x != point.x)
			return false;

		return y == point.y;

	}

	@Override
	public int hashCode() {
		int result = x;
		result = 31 * result + y;
		return result;
	}
}
