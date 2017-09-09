package org.json.simple.parser;

import java.util.*;
class CoinFlip
{
	public static void main(String []args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number of times to flip coin");
		int number=scan.nextInt(); //Get the number of flips from user. 
		int heads=0,tails=0;
		Random r=new Random(); 
		float random; 
		if(number>0) //check for positive number.
		{
			for(int i=0;i<number;i++)
			{
				random=r.nextFloat(); //collect the random number.
				if(random<0.5) //check for heads or tails.
				{
					heads++; //if head increment head count.
				}
				else
				{
					tails++; //it tail increment tail count.
				}
			}
			float headpercent =(float) heads*100/number; //calculate the percentage of heads.
			float tailpercent =(float) tails*100/number; //calculate the percentage of tails.
				//display the percent.
			System.out.println("Percentage of Heads is " + headpercent + " % .");
			System.out.println("Percentage of Tails is " + tailpercent +"% .");
		}
		else //if number 0 or lessthan 0.
		{
			System.out.println("Number must be positive. ");
		}
	}
	
}
