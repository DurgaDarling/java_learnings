import java.util.Scanner;
class DuckNumOrNot 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the digits to know it is Duck num or not");
		int num=scan.nextInt();
		boolean isDuckNum=false;
		while (num>0)
		{
			int ld = num%10;
			if (ld==0)
			{
				isDuckNum=true;
				break;
			}
			num=num/10;
		}
			if (isDuckNum==true)
			{
				System.out.println(num+"=It is Duck Number");
			}
			else
			{
				System.out.println(num+"=It is Not a Duck Number");
			}
		}
	}
