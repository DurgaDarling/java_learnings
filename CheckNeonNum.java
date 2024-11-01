import java.util.Scanner;
class  CheckNeonNum
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Num to check NEOn num");
		int num=scan.nextInt();
		int sum=0;
		int square=num*num;
		while (square>0)
		{
			int ld = square%10;
			sum=sum+ld;
			square = square/10;
		}
		if (sum==num)
		{
			System.out.println("It is neon num");
		}
			else 
		{
				System.out.println("It is not neon num");
		}
	}
}