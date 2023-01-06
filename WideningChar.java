class WideningChar
{
 public static void main(String[]args)
 {
  {
   char a='A';
   char d=a;
   System.out.println(a);
   System.out.println(d);
  }
  {
   char a='B';
   long d=a;
   System.out.println(a);
   System.out.println(d);
  }
  {
   char a='C';
   float d=a;
   System.out.println(a);
   System.out.println(d);
  }
  {
   char a='D';
   double d=a;
   System.out.println(a);
   System.out.println(d);
  }
 }
}