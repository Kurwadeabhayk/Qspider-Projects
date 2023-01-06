import java.util.Scanner;
class OddEven_While
{
 public static void main(String[]args)
 {
  Scanner a= new Scanner(System.in);
  System.out.println("Enter a Starting Number: ");

  int i =a.nextInt();
  int j =a.nextInt();


  while(i<=j)
  {
	 // if (i%2==0)
	  //{
		  System.out.println((i=i+2)+"it is even") ;
		  
	  //}  
  }

  System.out.println("Enter a Ending number: ");


  while (j<=i)
  {
	  //if (j%2!=0)
	  //{
		  System.out.println((j=+2-1)+"it is ODD");
		  
	  //}     
  }
 }
}
  