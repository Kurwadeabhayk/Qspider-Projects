import java.util.Scanner;
class  DecimalToHex
{
	public static void main(String[] args) 
	{
		Scanner s =new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int num = s.nextInt();

		String hex = " " ;
		char hexch[] =('0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F');

		while (num !=0)
		{
			int rem =num % 16;

			hex = hexch(rem) + hex ;

			num/=16;

		}
		System.out.println(Integer.toHexString(num));
	}
}

