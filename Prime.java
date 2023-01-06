class Prime 
{
	public static void prime()
	{
		int num=7;
		for (int i=2;i<num ;i++)
		{
			if (num%i==0)
			{
				break;
			}
		
		if (i==num)
			{
				System.out.println(num + "Its a PRIME Number.");
			}
		}
	}

	public static void main(String[] args) 
	{
		prime();
	}
}
