class ProdutOfFactors 
{
	public static void main(String[] args) 
	{
		int num=4;
		int product=1;
		for (int i=1;i<=num ;i++ )
		{
			if (num%1==0)
			{
				product=product*i;
			}
		}
				System.out.println(product);
		}
	}

