import java.util.Scanner;
class  FloydTriangleName
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your character length of name in number: ");
		int count = s.nextInt();

		while (true)
		{
		
		System.out.println("Insert alphabet of your name in uppercase one by one : ");
		char name= s.next().charAt(0); //entered name stored
		
		System.out.println("Are there alphabet left of your name: 0/1");
		//char  ip = s.next().charAt(0);
		int ip = s.nextInt();

		if (ip == 0)
			{
			continue;
			
			}
		else 
			{
			break;
			}
		}
	}
}












	//public static void triangle()
	//{
		
	//}
		
//char temp = name; //entered name for extracting 10th places
		
	//	int count = (char)temp; //count length of name
		
	//	int i,k=1; //i for rows outer loop & k for column inner loop
		
	//	for (i=1 ; i<=count-1 ; i++ )
	//	{
	//		for (k=1 ; k<=i ; k++ )
	//		{
	//			System.out.println(k + " ");
	//			count++;
	//		}
	//		System.out.println();