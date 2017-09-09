package org.json.simple.parser;

import java.util.Scanner;

class LeapYear{
	public static void main(String []args){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the year ");
		int year=scan.nextInt();
		int a=0,n=year;
		while(n!=0) 
		{
			a++;
			n/=10;
		}
			//check for four digit number
		if(a!=4) 
		{
			System.out.println("not a four digit number");
		}
		else
		{
				//check for leap year.
			n=year%4; 
			if(n==0)
			{
			System.out.println("Is a Leap year. ");
			}
			else
			{
				System.out.println("Is not a Leap year");
			}
		}
	}
}