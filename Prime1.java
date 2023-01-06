class Prime1
{
	public static void prime()
	{
		int num=7;
		int i;

		for (i=2;i<num ;i++)
		{
			if (num%i==0)
			{
				break;
			}
		
		
		if (i==num)
			{
				System.out.println(num + " Its a PRIME Number.");
			}

		else
			{
				System.out.println(num + " Its NOT a PRIME Number.");
			}
		}
	}

//	public static void nonPrime()
//	{
//		int num=15, i=2;
//		//System.out.println(num%i==0);
//		System.out.println(num + " Its not a PRIME Number.");
//	
//	}

	public static void main(String[] args) 
	{
		prime();
		//nonPrime();
	}
}
