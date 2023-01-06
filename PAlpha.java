import java.util.Scanner;
class  PAlpha
{
	public static void main(String[] args) 
	{
		Scanner s =new Scanner(System.in);
		
		System.out.println("Enter row count for Alphabets: ");
		int row=s.nextInt();

		System.out.println("Enter column count Alphabets: ");
		int col= s.nextInt();

		System.out.println("Enter an Alphabet: ");
		char ch= s.next().charAt(0);

		{
			for(int i=1 ; i<=col ; i++)
			{
				for(int j=1 ; j<=row ; j++)
				{
				System.out.print(ch + " ");
				ch++;
				}
		System.out.println();
			}
		}
	
	}
}
