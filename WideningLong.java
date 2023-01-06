class WideningLong
{
 public static void main(String[]args)
 {
  {
   long a=9765837214l;
   long d=a;
   System.out.println(a);
   System.out.println(d);
  }
  {
   long a=9765830001l;
   float d=a;
   System.out.println(a);
   System.out.println(d);
  }
  {
   long a=9765830002l;
   double d=a;
   System.out.println(a);
   System.out.println(d);
  }
 }
}