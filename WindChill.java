package com.day5rograms;

import java.util.Scanner;

public class WindChill {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of t");
		double t=sc.nextDouble();
		System.out.println("enter the value of v");
		double v=sc.nextDouble();
		double a=0.4275*t-35.75;
		double b=0.16;
		if(t<50 && v<120 && v>3)
		{
		int w=(int) (35.74+0.6215*t+(Math.pow(a,b)));
		System.out.println("value of wind chill==>"+w);
		}
		else
		{
			System.out.println("values are not in range");
		}

	}

}
