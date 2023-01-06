import java.util.Scanner;
class  OddWhileEven
{
	public static void main(String[] args) 
	{
		Scanner s =new Scanner(System.in);

		System.out.println("Enter a number: ");

		int num=s.nextInt();

		int start=0;
		 
		while(start<=10)
		{
			System.out.println((num%2==0) + "EVEN");
			++start;
		}
		
		while (start<=10)
		{
			System.out.println((num%2==1) + "ODD");
			++start;
		}
		
	}
}
