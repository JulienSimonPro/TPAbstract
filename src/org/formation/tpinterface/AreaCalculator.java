package org.formation.tpinterface;

public class AreaCalculator {

	private AreaCalculator() {
	}

	public static double sumArea(Surface[] tabSurface) {
		double sum = 0;
		for (Surface surface : tabSurface) {
			sum += surface.getArea();
		}
		return sum;
	}
}
