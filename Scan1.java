import java.util.Scanner;
class Scan1
{
 public static void main(String[]args)
 {
  Scanner a = new Scanner(System.in);
  
  System.out.println("Enter a whole number: ");
  int w= a.nextInt();

  System.out.println("Enter a true/false");
  boolean e= a.nextBoolean();
  
  System.out.println("Enter a character");
  char r= a.next().charAt(0);


  
  System.out.println(w);
  System.out.println(e);
  System.out.println(r);
 }
}