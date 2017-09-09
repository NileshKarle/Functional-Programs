package org.json.simple.parser;

import java.util.*;
class Power_of_Two
{
	public static void main(String []args)
	{
		Scanner scan=new Scanner(System.in);
		int value=2;
		int number=Integer.parseInt(args[0]); //Get the first number from the argument.
			//check if given number is in 0-30 range.
		if(number>=0 && number<31) 
		{
			for(int i=0;i<=number;i++)
			{
				if(i==0) //for 2^0 .
				{
					System.out.println("2^0 = 1");
				}
				else
				{
					System.out.println("2^"+i+" = " + value);
					value*=2; //multiply the value by 2.
				}
			}
		}
			//if invalid input.
		else
		{
			System.out.println("Number out of range. ");
		}
	}
}