import java.util.*;
class checkArray
{
	int j,c,d,i;
	static int g,v;
	static String a[][]=new String[3][3];
		//mark the board with "-".
    static
	{
		for(g=0;g<3;g++)
		{
			for(v=0;v<3;v++)
			{
			a[g][v]="-";
			}
		}
	}
	Random r=new Random(); //to generate random number.
	public int see(int m,int n)
	{ 
	j=0;
		//check if the given position is empty or not.
	if(a[m][n]!="O"||a[m][n]!="x")
	{
		a[m][n]="x";
			//systems turn to play.
		while(j!=1)
			{
			c=r.nextInt(3);
			d=r.nextInt(3);
			if(a[c][d]=="-")
				{
				 a[c][d]="O";
				 j=1;
				}
			}
		for(i=0;i<3;i++)
			{
			for(j=0;j<3;j++)
				{
					System.out.print(a[i][j] +"  ");
				}
				System.out.println(" ");
			}
		for(i=0;i<3;i++)
		{
			if((a[i][0]=="x"&&a[i][1]=="x"&&a[i][2]=="x")||(a[i][0]=="O"&&a[i][1]=="O"&&a[i][2]=="O"))
			{
				if(a[i][i]=="x")
				{
					System.out.println("you win");
					System.exit(0);
				}
				else if(a[i][i]=="O")
				{ 
					System.out.println("computer win");
					System.exit(0);
				}
			}
			else if((a[0][i]=="O"&&a[1][i]=="O"&&a[2][i]=="O")||(a[0][i]=="x"&&a[1][i]=="x"&&a[2][i]=="x"))
			{
				if(a[i][i]=="x")
				{
					System.out.println("you win");
					System.exit(0);
				}
				else if(a[i][i]=="O")
				{ 
					System.out.println("computer win");
					System.exit(0);
				}
			}
		}
			if((a[0][0]=="O"&&a[1][1]=="O"&&a[2][2]=="O")||(a[0][0]=="x"&&a[1][1]=="x"&&a[2][2]=="x"))
			{
				if(a[0][0]=="x")
				{
					System.out.println("you win");
					System.exit(0);
				}
				else if(a[0][0]=="O")
				{
					System.out.println("computer win");
					System.exit(0);
				}
			}
			else if((a[0][2]=="x"&&a[1][1]=="x"&&a[2][0]=="x")||(a[0][2]=="O"&&a[1][1]=="O"&&a[2][0]=="O"))
			{
				if(a[2][0]=="x")
				{
					System.out.println("you win");
					System.exit(0);
				}
				else if(a[2][0]=="O")
				{
					System.out.println("computer win");
					System.exit(0);
				}
			}
		return 1;
	}
		else
		{
			return 0;
		}
	}
}
class Tictactoe
{
	public static void main(String []args)
	{
		Scanner scan=new Scanner(System.in);
		int q,m,n,user,count=0;
		checkArray chk=new checkArray();
			//play untill someone wins or no place left th mark.
		while(count!=10)
		{
		System.out.println("Enter a matrix position to insert "); //collect the position to mark on the board.
		m=scan.nextInt();
		n=scan.nextInt();
		q=chk.see(m,n); //function call.
			if(q==1)
			{
				count=count+2;
			}
		}
	}
<<<<<<< HEAD
}
=======
<<<<<<< HEAD
}
=======
}
>>>>>>> b4473088f1298c37c3b8acc4fc2d69238247a790
>>>>>>> 627acfab8b19c0f4ba2aac4f5470127ef135dd4b
