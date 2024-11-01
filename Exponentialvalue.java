import java.util.Scanner;
class Exponentialvalue 
{
	public static void main(String[] args) 
	{
	Scanner scan=new Scanner (System.in);
	System.out.println("please enter the base value");
	int base=scan.nextInt();
	System.out.println("Please enter the power value");
	int power=scan.nextInt();
	int exp=1;
	for (int i=1;i<=power ;i++ )
	{
		exp=exp*base;
	}
	System.out.println("Exponential value is");
	System.out.println(exp);
	}
}
