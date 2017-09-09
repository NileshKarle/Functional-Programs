package org.json.simple.parser;

import java.util.*;
class Harmonic
{
	public static void main(String []args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a integer."); 

		int number=scan.nextInt(); //collect the value from the user.
		float answer=0.00f; 
		if(number <= 0) //check for positive value.
		{
			System.out.println("Number is invalid. ");
		}
		else
		{
				//sum untill the given value.
			for(int i=1;i<=number;i++)
			{
				answer=answer+(float) 1/i; 
			}
			System.out.println("The "+number+ " harmonic value is "+answer+ " ."); //display the answer.
		}
	}
}