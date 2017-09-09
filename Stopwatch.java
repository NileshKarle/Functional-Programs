import java.util.*;
class Stopwatch
{
	public static void main(String []args)
	{
		double start,end,time;
		Scanner scan=new Scanner(System.in);
		start=System.currentTimeMillis();
		scan.nextLine();
		end=System.currentTimeMillis();
		time=(double) end-start;
		System.out.println(" "+time+" millisec ");
	}
}
