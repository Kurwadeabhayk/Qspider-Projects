import java.util.Scanner;
class  Marksheet
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your marks");
		
		int mrks = s.nextInt();

		if (mrks >= 50 && mrks<=100)
		{
			System.out.println("PASS");
		}
		
		else if (mrks>=45  && mrks<50)
		{
			System.out.println("Passed by GRACE marks");
		}
		
		else 
		{
			System.out.println("FAIL - Study Hard");
		}
	}
}
