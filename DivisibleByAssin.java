class DivisibleByAssin 
{
	public static void main(String[] args) 
	{
		int num=12;
		if (num%3==0 && num%5==0)
		{
			System.out.println("Fizz Buzz");
		}
		else if (num%3==0)
		{
			System.out.println("Fizz");
		}
		else if (num%5==0)
		{
			System.out.println("Buzz");
		}
	}
}
