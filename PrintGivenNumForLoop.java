class PrintGivenNumForLoop 
{
	public static void main(String[] args) 
	{
		for (int num=3561; num>0 ;num=num/10 )
		{
			int ld=num%10;
			System.out.println(ld);
		}
	}
}
