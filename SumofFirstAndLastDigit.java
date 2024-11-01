import java.util.Scanner;
class SumofFirstAndLastDigit 
{
	public static void main(String[] args) 
	{
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter to Know the Sum of First and Last Digit");
		int num=scan.nextInt();
		int sum=0;
		int ld=num%10;
		while (num>9)
		{
			num=num/10;
		}
		sum=ld+num;
		System.out.println(sum);
	}
}
