import java.util.Scanner;
class FirstAndLastDigits 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Digits to know the first and last digits");
		int num=scan.nextInt();
		int ld=num%10;
		while (num>9)
		{
			num=num/10;
		}
		System.out.println("Last Digit");
			System.out.println(ld);
		System.out.println("First Digit");
		System.out.println(num);
	}
}
