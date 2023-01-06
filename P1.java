import java.util.Scanner;
class  P1
{
	public static void main(String[] args) 
	{
		Scanner s =new Scanner(System.in);

		System.out.println("Enter row count for rectangle: ");
		int row=s.nextInt();

		System.out.println("Enter column count rectangle: ");
		int col= s.nextInt();

		{
			for(int i=1 ; i<=col ; i++)
			{
				for(int j=1 ; j<=row ; j++)
				{
				System.out.print("*" + " ");
				
				}
		System.out.println();
			}
		}
	
	}
}
