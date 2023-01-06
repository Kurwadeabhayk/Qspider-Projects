import java.util.Scanner;
class  OddEven
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number: ");

		int i =s.nextInt();

		String res = i%2 == 0 ? "It is an Even number" : "It is an Odd number" ;
		System.out.println(res);
	}
}
