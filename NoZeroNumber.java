import java.util.Scanner;
class  NoZeroNumber
{
	public static void main(String[] args) 
	{
		Scanner s= new Scanner(System.in);

		System.out.println("Enter Starting Number: ");
		int n1= s.nextInt();

		System.out.println("Enter Ending Number: ");
		int n2= s.nextInt();

		for(int i= n1 ; i<=n2 ; i++)
		{
			int temp=i;

			while(temp>0)
			{
				int rem = temp % 10;
				
				if (rem == 0)
				{
					break;
				}

				if (rem>0)
				{
					temp/=10;
				}
				
				if (temp == 0)
				{
					System.out.println("     "+i);
				}

			}
		}
	}
}
