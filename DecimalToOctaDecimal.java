import java.util.Scanner;
class  DecimalToOctaDecimal
{
	public static void main(String[] args) 
	{
		Scanner s =new Scanner(System.in);
		System.out.println("Enter a Decimal number: ");

		int num =s.nextInt(); //user input taken

		String oct = " " ;

		while (num !=0)
		{
			int rem =num % 8;

			oct = rem + oct ;

			num/=8;

		}
		System.out.println(oct);
	}
}
