import java.util.Scanner;
class Scan2
{
 public static void main(String[]args)
 {
  Scanner q= new Scanner(System.in);

  System.out.println("Enter a B number: ");
  byte b1= q.nextByte();
  
  System.out.println("Enter a S number: ");
  short s1 = q.nextShort();

  System.out.println("Enter a L number: ");
  long l1= q.nextLong();

  System.out.println("Enter F number: ");
  float f1= q.nextFloat();

  System.out.println("Enter D number: ");
  double d1= q.nextDouble();

  System.out.println("Enter a word and multiword: ");
  String s2= q.next();
  
  System.out.println(q);
  System.out.println(b1);
  System.out.println(s1);
  System.out.println(l1);
  System.out.println(f1);
  System.out.println(d1);
  System.out.println(s2);
 }
}
