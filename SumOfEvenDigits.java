import java.util.Scanner;
class SumOfEvenDigits 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the  num to know the sum of even Digits");
		int num = scan.nextInt();
		int sum=0;
		while (num>0)
		{
			int ld =num%10;
			if (ld%2==0)
			{
				sum=sum+ld;
			}
			num=num/10;
		}
		System.out.println(sum);
	}
}
