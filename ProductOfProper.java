class ProductOfProper 
{
	public static void main(String[] args) 
	{
		int num=10;
		int pro=1;
		for (int i=1;i<num ;i++ )
		{
			if (num%i==0)
			{
				pro=pro*i;
			}
		}
		System.out.println(pro);
	}
}
