import java.util.Scanner;
class StrongNumOrNotUSingMethod 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=scan.nextInt();
		if (CheckStrongNumber(num)==num)
		{
			System.out.println("Given Num is A Strong Num");
		}
		else 
		{
			System.out.println("Given num is Not a Strong Num");
		}
		
	}
	public static  int CheckStrongNumber(int num)
	{
		int sum=0;
	while (num>0)
	{
		int ld=num%10;
		sum= sum+factorial(ld);
		num=num/10;
	}
	return sum;
}
public static int factorial(int num)
	{
	int fact = 1;
	for (int i=1;i<=num ;i++ )
	{
    fact =fact * i;
	}
	return fact;
	}
}
