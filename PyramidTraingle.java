import java.util.Scanner;
class  PyramidTraingle
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter the row value");
		int row=scan.nextInt();
		for (int i=1;i<=row ;i++ )
		{
			for (int j=row ;j>=1 ;j-- )
			{
				if (i>=j)
				{
					System.out.print("     * ");
				}
				else 
				{
					System.out.print("   ");
				}
			}
		System.out.println();
		}
	}
}
