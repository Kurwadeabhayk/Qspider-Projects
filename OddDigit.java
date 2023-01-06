import java.util.Scanner;
class  OddDigit
{
	public void main(String[] args) 
	{
		Scanner a=new Scanner(System.in);

		System.out.println("Enter Starting Number: ");
		int start=a.nextInt();

		System.out.println("Enter Ending Number: ");
		int end=a.nextInt();
		
		


		for(int i=start ; i<=end ; i++) //starting number.
		{
			if(i%2!=0)                 //all odd numbers b/w range.
			{
				int rem=i;
			
				while(rem>0)           //reminder of above odd number & divide by 10 2nd last digit of reminder is obtained.
				{
					rem/=10;
					int h;
					if(rem%2!=0)
					{	
						h=1;
					}
					else
					{
						h=0;
						break;
					}
				}
				if(h==1)//ask this to your master and learn how to define a global variable  to abhi se kayko aise questions dera wo!    //only logic batana h for loop, while loop, if loop, while loop, if loop kr k
				{
					System.out.println(i); //ok wo bad m seekhaiga bola global variable
				}
			}
		}
	}
}




//javac OddDigit.java        // for compiling


//java OddDigit              //for run