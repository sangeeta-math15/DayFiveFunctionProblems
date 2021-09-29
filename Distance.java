package com.day5rograms;

public class Distance {
	static double dis;

	static double CalDis(int x1, int y1, int x2, int y2) {
		dis = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2) * 1.0);
		return dis;
	}

	public static void main(String args[]) {
		int x1, x2, y1, y2;

		x1 = Integer.parseInt(args[0]);
		x2 = Integer.parseInt(args[1]);
		y1 = Integer.parseInt(args[2]);
		y2 = Integer.parseInt(args[3]);

		CalDis(x1, y1, x2, y2);

		System.out.println("distancebetween" + "(" + x1 + "," + y1 + ")," + "(" + x2 + "," + y2 + ")===>" + dis);

	}
}
