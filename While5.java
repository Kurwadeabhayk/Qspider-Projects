import java.util.Scanner;
class While5
{
 public static void main(String[]args)
 {
  Scanner a= new Scanner(System.in);
  System.out.println("Enter a Starting Number: ");
  int start =a.nextInt();
  
  System.out.println("Enter a Ending number: ");
  int end =a.nextInt();
  
  while(start<=end)
  {
   System.out.println((start) + "Even") ;
   start=start+2 ; 
  }

 }
}
  