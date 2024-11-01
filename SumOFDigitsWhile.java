class SumOFDigitsWhile 
{
	public static void main(String[] args) 
	{
		int num=123;
		int sum=0;
		while (num>0)
		{
			int ld=num%10;
			sum=sum+ld;
			num=num/10;
		}
			System.out.println(sum);
	}
}
