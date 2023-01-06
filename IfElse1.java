import java.util.Scanner ;
class IfElse1
{
 public static void main(String[]args)
 {
  Scanner sc= new Scanner(System.in) ;
  System.out.println("Enter your pin: ") ;
  
  int pin = sc.nextInt() ;
  int actPin = 0000 ;

  if (pin == actPin)
  {
   System.out.println("LOGIN SUCCESSFUL!") ;
  }
  else
  {
   System.out.println("INCORRECT PIN!") ;
  }
 }
}