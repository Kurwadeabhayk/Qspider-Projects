class Method1
{
	public static void even()
	{
		int i=2;
		
		{
				System.out.println(i);
				System.out.println(i!=0);
				System.out.println((i%2==0) + " Even Number");
		}
	}

	public static void odd()
	{
		int i=11;
		{
				System.out.println(i);
				System.out.println(i!=0);
				System.out.println((i%2==1) +" Odd Number") ;
		}


	}

		public static void prime()
	{
		int num=8;
		int i;

		for (i=2;i<num ;i++)
		{
			if (num%i==0)
			{
				break;
			}
		
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

	public static void modulus()
	{
		int num=1021;
		int mod=num%2;
		{
			System.out.println("The modulus of " +num+ " is :" +mod);

		}
	}

	public static void power()
	{
		int num=11;
		int power=num*num;
		{
			System.out.println("The power of " +num+ " is :" +power);
		}

	}

	public static void main(String[] args) 
	{
		even();
		System.out.println("**************************************** ");

		odd();
		System.out.println("**************************************** ");
		
		prime();
		System.out.println("**************************************** ");
		
		modulus();
		System.out.println("**************************************** ");

		power();
		System.out.println("**************************************** ");

	}
}
