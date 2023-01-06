import java.util.Scanner;
class PowerAdd 
{
	public static void main(String[] args) 
	{
		Scanner s =new Scanner(System.in);
		System.out.println("Enter a number: ");
		
		int base=s.nextInt();

		System.out.println("Enter the power: ");
		int raise=s.nextInt();
		int power=1;

		for(int i=0 ; i<raise ; i++)
		{
		power=power*base;
		}
	System.out.println("number of power is: "+power);
	}
}
