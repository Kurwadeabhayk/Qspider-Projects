class Method 
{
	public static void even()
	{
		int i=20;
			{
				System.out.println(i);
				System.out.println((i%2==0) + "Even Number");
			}
	}

	public static void odd()
	{
		int i=10;
			{
				System.out.println(i);
				System.out.println((i%2==1) +"Odd Number") ;
			}
	}
	public static void main(String[] args) 
	{
		even();
		odd();

	}
}
