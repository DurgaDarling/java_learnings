import java.util.Scanner;
class DuckNumCount
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the digits to know it is Duck num or not");
		int num=scan.nextInt();
		int count=0;
		int i=num;
		boolean isDuckNum=false;
		while (num>0 )
		{
			int ld = num%10;
			count++;
			if (ld==0)
				i++;
			{
				isDuckNum=true;
				break;
			}
		}
			if (count==2)
		{
				System.out.println(count);
		}
	}
}
