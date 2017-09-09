import java.util.*;
import java.io.*;
class Two_D_Array
{
	public static void main(String []args)
	{
		Scanner scan=new Scanner(System.in);
		PrintWriter pw=new PrintWriter(System.out, true); //used to print the value through outputstream.
		int i,j;
		pw.println("enter number of rows. ");
		int rows=scan.nextInt();
		pw.println("enter number of columns. ");
		int cols=scan.nextInt();
		String array[][]=new String[rows][cols];
		pw.println("enter the values ");
			//collect values.
		for(i=0;i<rows;i++)
		{
			for(j=0;j<cols;j++)
			{
				array[i][j]=scan.next();
			}
		}
			//display values.
		pw.println("Values you entered are. ");
		for(i=0;i<rows;i++)
		{
			for(j=0;j<cols;j++)
			{
				pw.print(array[i][j] + "  ");
			}
			pw.println(" ");
		}
	}
}