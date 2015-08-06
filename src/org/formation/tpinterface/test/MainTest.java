package org.formation.tpinterface.test;

import java.util.ArrayList;
import java.util.Iterator;

import org.formation.tpinterface.*;

public class MainTest {

	public static void main(String[] args) {
		ArrayList<Surface> tabSurface = new ArrayList<>();
		tabSurface.add(new Circle(2));
		tabSurface.add(new Square(2));
		tabSurface.add(new Rectangle(2, 2));

//		for (Surface surface : tabSurface) {
//			System.out.println(tabSurface.size());
//			tabSurface.remove(surface);
//			System.out.println(tabSurface.size());
//		}
		
		for (Iterator<Surface> iterator = tabSurface.iterator(); iterator.hasNext();) {
			iterator.next();
			System.out.println(tabSurface.size());
			iterator.remove();
			System.out.println(tabSurface.size());
		}

		// System.out.println(AreaCalculator.sumArea(tabSurface));

		// ((Circle) tabSurface[0]).printMe("Bonjour");
	}

}
