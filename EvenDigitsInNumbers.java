import java.util.Scanner;
class EvenDigitsInNumbers 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the num to Know even DIgits");
		int num=scan.nextInt();
		int i=num;
		while (num>0)
		{
			int ld=num%10;
			num=num/10;
		}
		if (num % 2 ==0)
		{
			System.out.println("It is EVen NUmber");
		}
		else 
		{
			System.out.println("Not Even Number");
		}

	}
}
