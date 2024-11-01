import java.util.Scanner;
class SumOfMeanDigits 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter digits to know the sum of mean value");
		int num=scan.nextInt();
		int sum=0;
		num=num/10;
		while (num>9)
		{
			int ld=num%10;
			sum=sum+ld;
			num=num/10;
		}
		System.out.println(sum);
	}
}
