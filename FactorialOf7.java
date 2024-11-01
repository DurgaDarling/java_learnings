class OddFactorsof12 
{
	public static void main(String[] args) 
	{
		int num=12;
		int pro=1;
		for (int i=num;i>=12 ;i-- )
		{
			if (i%2!=0)
			{
				pro=pro*i;
			}
		
		
			System.out.println(pro);
		}
	}
}
