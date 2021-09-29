package com.day5rograms;

import java.util.Scanner;

public class Quadratic {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c; // Quadratic Variables declaration
		System.out.println("Enter the value of a..");
		a = sc.nextInt(); // Quadratic Variables Initialization
		System.out.println("Enter the value of b..");
		b = sc.nextInt(); // Quadratic Variables Initialization
		System.out.println("Enter the value of c..");
		c = sc.nextInt(); // Quadratic Variables Initialization

		int delta = (b * b) - (4 * a * c); // Find the determinant
		int D = (int) Math.sqrt(delta);
		int r = 2 * a;

		if (D > 0) {
			System.out.println("Roots are real and unequal");
			int root1 = (D - b) / r;
			int root2 = (-D - b) / r;
			System.out.println("Roots are..");
			System.out.println(root1);
			System.out.println(root2);
		} else if (D == 0) {
			System.out.println("The roots of the quadratic equation are real and equal");
			int root = (-b) / r;
			System.out.println("Root is " + root);
		} else {
			System.out.println("The roots of the quadratic equation are complex and different");
			System.out.println("Roots are ");
			System.out.println((-b / r) + " +i" + D);
			System.out.println((-b / r) + " -i" + D);
		}

	}

}
