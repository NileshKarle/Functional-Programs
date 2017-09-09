package org.json.simple.parser;

import java.util.*;
	//a staticfunction class to generate number
/**
 * @author Nilesh
 * 
 * @description generate a random value and return it.
 *
 */
class StaticFunction
{
	private int value;
	Random r=new Random();
	public int mGet(int n)
	{
		value=r.nextInt(n);
		return value;
	}
}
class Coupon
{
	public static void main(String []args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of coupons you have to generate.");
		int size=scan.nextInt();
		System.out.println("enter the range in which you have to generate the coupons.");
		int n=scan.nextInt();
		if(n<=size)
		{
			System.out.println("coupons cannot be generated.");
			System.exit(0);
		}
		int array[]=new int[size];
		int count=0,value,position=0,j;
		StaticFunction sf=new StaticFunction(); //object creation.
			//get all the different values.
		while(position!=size)
		{
			/*
			 * repeat unless the required amount of numbers are generated.
			 * 
			 */

			value=sf.mGet(n);

			count++;
			j=0;
			if(position==0)
			{

				array[position]=sf.mGet(n);

				position++;
			}
			else
			{
				/*
				 * check if the number exists or not.
				 */
				for(int z:array)
				{
					if(z==value)
					{
						j=1;
						break;
					}
				}
				if(j==0)
				{
					array[position]=value;
					position++;
				}
				
			}
		}
		System.out.println("The "+size+" values are ");
		for(j=0;j<size;j++)
		{
		System.out.print(" "+array[j]+" "); //display the different values.
		}
		System.out.println(" ");
		System.out.println("total numbers generated are "+count+" "); //count of total numbers generated.
	}
}
