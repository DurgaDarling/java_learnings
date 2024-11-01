import java.util.Scanner;
class PalindromeDigits 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter to know the Digist or Palindrone or not  ");
		int num=scan.nextInt();
		int rev1=num;
		int rev=0;
		while (num>0)
		{
			int ld=num%10;
			rev=rev*10+ld;
			num=num/10;
		}
		if (rev1==rev)
		{
			System.out.println("Given num is a palindrome num");
		}
		else  
		{
			System.out.println("Given num is not a palindrome num");
		}
	}
}
