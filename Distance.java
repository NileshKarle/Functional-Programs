package org.json.simple.parser;
import java.util.*;

public class Distance 
{

	public static void main(String []args) 
	{
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the value of x and y");
		int x=scan.nextInt();
		int y=scan.nextInt();
		double ans;
		x=x*x;
		y=y*y;
		x=x+y;
		ans=Math.sqrt(x);
		System.out.println("the distance is "+ans+" .");
	}

}
