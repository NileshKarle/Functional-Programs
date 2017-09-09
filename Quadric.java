package org.json.simple.parser;

import java.util.*;
class Quadric
{
	public static void main(String[]args)
	{
	Scanner scan=new Scanner(System.in);
		//collect the value's from user.
	System.out.println("enter the value of a");
	double a=scan.nextDouble();
	System.out.println("enter the value of b");
	double b=scan.nextDouble();
	System.out.println("enter the value of c");
	double c=scan.nextDouble();
	System.out.println(a+"x*x +"+b+"x +"+c);
		//calculate the root and display the answer.
		double mid=Math.sqrt(-(b*b-4*a*c));
	double root1=(-b+mid)/(2*a);
	double root2=(-b-mid)/(2*a);
	System.out.println("root1= "+root1+" ");
	System.out.println("root2= "+root2+" ");
	
	}
}
