package com.day5rograms;

import java.util.Scanner;

public class TwoDimensionArray {
	public static void main(String args[]) {
		ArayDimension();
	}

	private static void ArayDimension() {
		int row, col, i, j;
		int arr[][] = new int[10][10];
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter row for the array: "); // Enter row and column array (maximun 10)
		row = scan.nextInt();
		System.out.print("Enter column for the array : ");
		col = scan.nextInt();

		int row_col = row * col;
		System.out.println("Enter " + row_col + " Array Elements : "); // enter array elements.
		for (i = 0; i < row; i++) {
			for (j = 0; j < col; j++) {
				arr[i][j] = scan.nextInt();
			}
		}
		System.out.print("The Array is :\n"); // print the 2D array is here.
		for (i = 0; i < row; i++) {
			for (j = 0; j < col; j++) {
				System.out.print(arr[i][j] + "  ");
			}
			System.out.println();
		}
	}
}
