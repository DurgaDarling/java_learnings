class DigitsFirstHalfAndLasthalf 
{
	public static void main(String[] args) 
	{
		int num=2233;
		int count=0;
		int temp=num;
		while (num>0)
		{
			count ++;
			num= num/10;
		}
			num=temp;
			if (count%2==1)
			{
				System.out.println("number cannot be divided");
			}
		    else
			{
				int exp=1;
				for (int i=1;i<=count/2 ;i++ )
				{
					exp =exp*10;
				}
				int firstHalf=temp/exp;
				int lastHalf=temp%exp;
				System.out.println(firstHalf);
				System.out.println(lastHalf);
					}
				}
			}
