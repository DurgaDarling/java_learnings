import java.util.Scanner;
class PallindromeNumberMethodUsing 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Number");
		int num=scan.nextInt();
		if (reverseOfNum(num)==num)
		{
			System.out.println("Given num is a pallindrome num");
		}
		else 
		{
			System.out.println("Given num is not a pallidrome num");
		}		
	}
    public static int reverseOfNum(int num)
{
	int rev=0;
	while (num>0)
	{
		int ld =num%10;
		rev=rev*10+ld;
		num=num/10;
	}
	return rev;
}
}
