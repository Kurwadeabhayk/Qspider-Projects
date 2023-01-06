import java.util.Scanner;
class While6
{
 public static void main(String[]args)
 {
  Scanner a= new Scanner(System.in);
  System.out.println("Enter a Starting Number: ");
  System.out.println("Enter a Ending number: ");

  int start =a.nextInt();
  int end =a.nextInt();
  int temp=start;
  while(temp<=end)
  {
   System.out.println((temp) + "Even") ;
   temp=temp+2 ;  
  }

  while (start<=end)
  {
   System.out.println((end) + "ODD");
   end=start+2-1;  
   start++;
  }
 }
}
  