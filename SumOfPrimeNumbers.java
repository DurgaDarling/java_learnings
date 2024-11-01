class SumOfPrimeNumbers 
{
         public static void main(String[] args) 
	{
		int i=0;
		int num=0;
		int count = 0;
		int sum = 0;
			
					for(num = 1; num<= 100; num++)
		{
			count = 0;
		    for (i = 2; i <= num/2; i++)
		    {
		    	if(num % i == 0)
		    	{
		    		count++;
		    		break;
		    	}
		    }
		    if(count == 0 && num != 1 )
		    {
		    	sum = sum + num;
		    }  
		}
                System.out.println("\n The Sum of Prime Numbers from 1 to 100 = " + sum);
	}
}
