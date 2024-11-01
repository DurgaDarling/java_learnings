import java.util.Scanner;
class ArmStrongNumUsingMethod
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number ");
		int num=scan.nextInt();
		if (checkarmstrongNumber(num)==num)
		{
			System.out.println("Given num is a Armstrong Num");
		}
		else 
		{
			System.out.println("Given Num is Not a Armstrong Num");
		}
	}
	public static int checkarmstrongNumber (int num)
	{
		int sum=0;
		int power=count (num);
		while (num>0)
		{
			int ld=num%10;
			sum=sum+expo(ld,power);
			num=num/10;
		}
		return sum;
}
public static int count(int num)
	{
	int count=0;
	while (num>0)
	{
		count++;
		num=num/10;
	}
	return count;
	}
	public static int expo(int base,int power)
	{
		int exp=1;
		for (int i=1;i<=power ;i++ )
		{
			exp=exp*base;
		}
		return exp;
	}
}
