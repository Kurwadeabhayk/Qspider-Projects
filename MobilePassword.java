import java.util.Scanner;
class  MobilePassword
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int pass= 0022;
		int count= 0;

		do
		{
			System.out.println("Enter your PIN: ");
			int pin=s.nextInt();

			if(pass==pin)
			{
				System.out.println("Logged IN");
				break;
			}
			else
			{
				System.out.println("Incorrect Password");
			}
				count++;
		}
		while (count <3);
		
		if(count == 3)
		{
			System.out.println("MAX ATTEMPT REACHED");
		}
	}
}
