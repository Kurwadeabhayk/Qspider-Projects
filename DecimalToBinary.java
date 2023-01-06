import java.util.Scanner;
class  DecimalToBinary
{
	public static void main(String[] args) 
	{
		Scanner s =new Scanner(System.in);
		System.out.println("Enter a Decimal number: ");

		int num =s.nextInt(); //user input taken

		String bin = " " ;

		while (num !=0)
		{
			int rem =num % 2;

			bin = rem + bin ;

			num/=2;

		}
		System.out.println(bin);
	}
}
