class ProductOfFirstAndLastDigits 
{
	public static void main(String[] args) 
	{
		int num=1232;
		int pro=1;
		int ld=num%10;
		while (num>9)
		{
			num=num/10;
			pro=pro*num;
		}
		System.out.println(pro);
	}
}