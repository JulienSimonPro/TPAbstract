package org.formation.tpinterface;

public class Rectangle implements Surface {
	private double width, height;

	public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}

	@Override
	public double getArea() {
		return height * width;
	}
}
