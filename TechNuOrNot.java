class TechNuOrNot 
{
	public static void main(String[] args) 
	{
		int num=2025;
		int count=0;
		int sum=0;
		int temp=num;
		while (num>0)
		{
			count++;
			num=num/10;
		}
		if (count%2==0)
		{
			num=temp;
			int exp=1;
			for (int i=1;i<=count/2 ;i++ )
			{
				exp=exp*10;
			}
			int first=num/exp;
			int second=num%exp;
			sum=first+second;
			int square=sum*sum;
			if (square==num)
			{
				System.out.println("It is a tech num");
			}
			else 
			{
				System.out.println("It is a not tech num");
			}
		}
			else
			{
				System.out.println("Num cannot be divided");
			}
	}
}