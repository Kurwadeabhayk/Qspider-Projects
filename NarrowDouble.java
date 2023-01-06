class NarrowDouble
{
 public static void main(String[]args)
 {
  {
   double d=(double) 99f;
   double a=(double) d;
   System.out.println(d);
   System.out.println(a);
  }
  {
   double d=(double) 96l;
   float a=(float) d;
   System.out.println(d);
   System.out.println(a);
  }
  {
   double d=(double) 'Z';
   long a=(long) d;
   System.out.println(d);
   System.out.println(a);
  }
  {
   double d=(double) 'b';
   int a=(int) d;
   System.out.println(d);
   System.out.println(a);
  }
  {
   double d=(double) 100.123;
   char a=(char) d;
   System.out.println(d);
   System.out.println(a);
  }
  {
   double d=(double) 85;
   short a=(short) d;
   System.out.println(d);
   System.out.println(a);
  }
  {
   double d=(double) 119;
   byte a=(byte) d;
   System.out.println(d);
   System.out.println(a);
  }
 }
}