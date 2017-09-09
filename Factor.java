package org.json.simple.parser;

import java.util.scanner;
class Factor
{
	public static void main(String []args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number. "); 
		int number=scan.nextInt();
			//untill the number is completely factorized.		
			if(number==1)
			{
				System.out.println("1");
				System.exit(0);
			}
		while(number!=1) 
			//untill the number is completely factorized.
		{
				//check if divisible by 2.
			if(number%2==0)
			{
				System.out.println(" 2 ");
				number=number/2;
			}
				//check if divisible by other numbers.
			else
			{
				for(int i=3;i<=number;i=i+2)
				{
					if(number%i==0)
					{
						System.out.println(" "+i+" ");
						number=number/i;
						break;
					}
				}
			}
		}
		System.exit(0);
	}
}
