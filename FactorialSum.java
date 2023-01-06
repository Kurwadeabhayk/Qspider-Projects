import java.util.Scanner;
class  FactorialSum
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a Number: ");

		int num= s.nextInt();  // user input
		 int sum=0;            // addition variable intialised
		int temp =num;         // temp variable in place of user input 
		 
		 while(temp>0)         // temp variable always greater than 0
		{
			 int fact =1;      //intialise fatorial as 1 (coz 0!=1)
			 int rem= temp%10; // remainder of fatorial

			 for (int i=rem ; i>0 ;i-- )   //again intialise variable to store & compare remainder
			 {
				 fact=fact*i;              // fatorial multiplication with reminder
			 }
			 
			 sum=sum+fact;                // sum + 1 (as fact = 1)
			 temp/=10;                    //num divide by 10 reduces last digit from temp 
			                                  //EG: "1020" is left with "102" then with "10" then with "1"  

		}
				 System.out.println(sum);	//sum is printed of input number factorial
	}
}
