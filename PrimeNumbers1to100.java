class PrimeNumbers1to100 
{
	public static void main(String[] args) 
	{
	 for (int a=1;a<=100 ;a++ )
	 {
		 int num=a;
		 int count=0;
		 for (int i=1;i<=num ;i++ )
		 {
			 if (num%i==0)
			 {
				 count++;
			 }
		 }
			 if (count==2)
			 {
				 System.out.println(num);
			 }
		 }
	 }
	}
