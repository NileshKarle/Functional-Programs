import java.util.*;
class Sum_Zero
{
	public static void main(String []args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the length of array");
		int size=scan.nextInt(); //collect size.
		if(size>=3)
		{
			System.out.println("Enter the numbers.");
			int count=0,i,j,k;
			int numbers[]=new int[size]; //create an array of given size.
			for(i=0;i<size;i++)
			{
				numbers[i]=scan.nextInt();
			}
				//check the sum of all 3 distinct numbers.
			for(i=0;i<size-2;i++)
			{
				for(j=i+1;j<size-1;j++)
				{
					for(k=j+1;k<size;k++)
					{
						if(numbers[i]+numbers[j]+numbers[k]==0)
						{
							count++;
							System.out.println(numbers[i]+" + "+numbers[j]+" + "+numbers[k]+" = 0. ");
						}
					}
				}
			}
			System.out.println("total number of distinct triples are "+count+" .");
		}
		else
		{
			System.out.println("Number is too small. ");
		}
	}
}