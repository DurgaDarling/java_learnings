import java.util.Scanner;
class MeanDigitsInaGivenNum 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Value to Know the MEAN digits");
		int num=scan.nextInt();
		num=num/10;
		while (num>9)
		{
			int ld =num%10;
			System.out.println(ld);
			num=num/10;
		}
	}
}
