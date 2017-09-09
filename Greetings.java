package org.json.simple.parser;

import java.util.*;
class Greetings
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your name (must be more than 3 characters)"); 
		String a=sc.nextLine(); //Get the name from user.
		int n=a.length();
		if(n>=3) //Check for minimum 3 characters
		{
		System.out.println("Hello  " + a + "  How are you ?");
		}
		else
		{
			System.out.println("Name too small ..!!");
		}
	}
}
