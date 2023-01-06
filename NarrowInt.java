class NarrowInt
{
 public static void main(String[]args)
 {
  {
   int i=(int)'&';
   int a=(int)i;
   System.out.println(i);
   System.out.println(a);
  }
  {
   int i=(int)'$';
   char a=(char)i;
   System.out.println(i);
   System.out.println(a);
  }
  {
   int i=(int)65;
   short a=(short)i;
   System.out.println(i);
   System.out.println(a);
  }
  {
   int i=(int)-50;
   byte a=(byte)i;
   System.out.println(i);
   System.out.println(a);
  }
 }
}