class EvenMeanDigits 
{
	public static void main(String[] args) 
	{
		int num=969431;
	    num=num/10;
		while (num>9)
		{
			int ld=num%10;
			int i=ld;
			num=num/10;
		if (i%2==0)
		{
			System.out.println(i);
		}
        }
	}
}
