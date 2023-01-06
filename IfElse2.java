import java.util.Scanner;
class IfElse2
{
 public static void main(String[]args)
 {
  Scanner b = new Scanner(System.in);
  System.out.println("Enter a year: ");
  
  int year = b.nextInt();
  if ((year %4 == 0  &&  year %100 !=0) || (year %400 ==0))
  {
   System.out.println("IT IS A LEAP YEAR!");
  }
  else
  {
   System.out.println("IT IS NOT A LEAP YEAR!");
  }
 }
}