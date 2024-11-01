import java.util.Scanner;
class  ReverseTheDigits
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter digits to get value in reverse");
		int num=scan.nextInt();
		int rev=0;
		while (num>0)
		{
			int ld=num%10;
			rev=rev*10+ld;
			num=num/10;
		}
		System.out.println("Number reverse is"+rev);
	}
}
