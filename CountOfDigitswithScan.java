import java.util.Scanner;
class CountOfDigitswithScan 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the num to get count of digits");
		int num =scan.nextInt();
		int count=1;
		while (num>0)
		{
			count++;
			num=num/10;
		}
		System.out.println(count);
	}
}
