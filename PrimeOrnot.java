class PrimeOrnot 
{
	public static void main(String[] args) 
	{
		int num=29;
		int count=0;
		for (int i =1;i<=5 ;i++ )
		{
			if(num%i==0)
			count++;
		}
        if (count==2)
			System.out.println("Given numer is a prime");
		   else
		{
		   System.out.println("Given num is not a prime");
		   }
	}
}

