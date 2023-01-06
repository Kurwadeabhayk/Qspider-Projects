import java.util.Scanner;
class While61
{
 public static void main(String[]args)
 {
  Scanner a= new Scanner(System.in);
  System.out.println("Enter a Starting Number: ");
  System.out.println("Enter a Ending number: ");

  int start =a.nextInt();
  int end =a.nextInt();

  while(start<=end)
  {
   System.out.println((start % 2=0) + "Even") ;
   start++;
  }


  while (start<=end);
  {
   System.out.println((end % 2!=0) + "ODD");
     end++;
  }
 }
}
  