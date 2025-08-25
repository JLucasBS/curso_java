package Utils;

import entities.Triangle;

public class Utils {

	public static double calcArea(Triangle t) {
		double p = (t.a + t.b + t.c) / 2.0;
		double area = Math.sqrt((p) * (p - t.a) * (p - t.b) * (p - t.c));

		return area;
	}

}
