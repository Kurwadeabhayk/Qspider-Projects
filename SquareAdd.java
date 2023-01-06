import java.util.Scanner;
class SquareAdd 
{
	public static void main(String[] args) 
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter a number: ");

		int num =s.nextInt();
		int sum =0;

		while(num!=0)
		{
		int rem= num%10;
		//reverse= reverse*10 +rem;
		sum = sum + (rem*rem);
		num/=10;
		}
		System.out.println("The Addition of Squareroot is:"+sum);

	}
}
