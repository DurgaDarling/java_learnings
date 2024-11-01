import java.util.Scanner;
class  CheckHarshadNum
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the num to check it is HARSHAD num");
		int num=scan.nextInt();
		int i=num;
		int sum=0;
		while (num>0)
		{
			int ld =num%10;
			sum =sum+ld;
			num=num/10;
		}
		if (i%sum==0)
		{
			System.out.println("The Given Number is HARSHAD Number");
		}
		else 
		{
			System.out.println("The Given Number is Not a HARSHAD Number");
		}
	}
}
