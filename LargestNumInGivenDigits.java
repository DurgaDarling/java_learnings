import java.util.Scanner;
class  LargestNumInGivenDigits
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner (System.in);
		System.out.println("Enter Digits To Know largest number");
		int num=scan.nextInt();
		int largest=0;
		while (num>0)
		{
			int ld=num%10;
			if (ld>largest)
			{
				largest=ld;
			}
			num=num/10;
		}
		System.out.println(largest);
	}
}
