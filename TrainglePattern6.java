import java.util.Scanner;
class TrainglePattern6 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Please Enter the Row Value");
		int row=scan.nextInt();
		int num=1;
		int num1=2;
		for (int i=1;i<=row ;i++ )
		{
			for (int j=1;j<=row ;j++ )
			{
				if (i<=j)
				{
					if (num%2==0)
					{
						System.out.print(num+"\t");
						num+=2;
					}
					else
					{
						System.out.print(num1+"\t");
						num1+=2;
					}
					}
			}
				System.out.println();
			}
		}
	}
