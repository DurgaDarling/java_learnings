class StrongNumorNot 
{
	public static void main(String[] args) 
	{
		int num=145;
		int sum=0;
		int temp=num; 
		while (num>0)
		{
			int ld =num%10;
			int pro=1;
			for (int i=1;i<=ld ;i++ )
			{
				pro=pro*i;
			}
			sum=sum+pro;
			num=num/10;
		}
			if (sum==temp)
			{
				System.out.println("STRONG NUMBER");
			}
			else 
			{
				System.out.println("Not A Strong Number");
			}
		}
	}

