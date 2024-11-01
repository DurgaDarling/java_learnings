class PerfectNumbers1to100 
{
	public static void main(String[] args) 
	{
		for (int a=1;a<=100 ;a++)
		{
			int num=a;
			int sum=0;
			for (int i=1;i<num;i++ )
			{
				if(num%i==0)
				{
					sum =sum+i;
			}
			}
			if (sum==num)
			{
				System.out.println(num);
			}
		}
	}
}
