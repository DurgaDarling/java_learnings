import java.util.Scanner;
class AutomorphicNumOrNot 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Digits to Know it is Automorphic num or not");
		int num=scan.nextInt();
		int square=num*num;
		boolean isAutomorphicNum=true;
		while (num>0)
		{
			int ld1=num%10;
			int ld2=square%10;
			if (ld1!=ld2)
			{
				isAutomorphicNum=false;
				break;
			}
			num=num/10;
			square=square/10;
		}
		if (isAutomorphicNum==true)
		{
        System.out.println("It is Automorphic num");
		}
		else 
		{
			System.out.println("It is not a Automorphic num");
		}
	}
}
