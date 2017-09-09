import java.util.scanner;
class Windchill
{
public static void main(String[]args)
{
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the value of T greater than 50");
	int t=scan.nextInt();
	System.out.println("enter the value of v greater than 120 or less than 3");
	int v=scan.nextInt();
	float q=(float) Math.pow(v,0.16);
	float z=(float) (35.74+0.6215*t+((0.4275*t)-35.75)*q);
	System.out.println(" w = "+z);
} 
}
