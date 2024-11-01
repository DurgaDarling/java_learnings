import java.util.Scanner;
class SpyNumChecking 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter to check the number is SPY num");
		int num=scan.nextInt();
		int sum=0;
		int pro=1;
		while (num>0)
		{
			int ld = num%10;
			sum =sum+ld;
			pro = pro*ld;
			num=num/10;
		}
		if (sum==pro)
		{
			System.out.println("SpY num");
		}
		else 
		{
			System.out.println("Not a spy num");
		}
	}
}
