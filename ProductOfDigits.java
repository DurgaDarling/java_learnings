class ProductOfDigits 
{
	public static void main(String[] args) 
	{
		int num=161;
		int pro =1;
		while (num>0)
		{
			int ld = num%10;
			pro = pro * ld;
			num = num/10;
		}
		System.out.println(pro);
	}
}
