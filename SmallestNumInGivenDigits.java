import java.util.Scanner;
class SmallestNumInGivenDigits 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Digits to know the smallest num");
		int num=scan.nextInt();
		int smallest=9;
		while (num>0)
		{
			int ld =num%10;
			if (ld<smallest)
			{
				smallest=ld;
			}
		num=num/10;
		}
		System.out.println(smallest);
	}
}
