class LocalVar1 
{
	public static void main(String[] args) 
	{
		{
			int a= 99 ;
			float d=a;
			System.out.println(d);//widening
		}
		{
		char a='Z';
		System.out.println(a);
		}
	}
}
