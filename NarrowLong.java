class NarrowLong
{
 public static void main(String[]args)
 {
  {
   long l=(long)'f';
   int a=(int)l;
   System.out.println(l);
   System.out.println(a);
  }
  {
   long l=(long)110.55;
   char a=(char)l;
   System.out.println(l);
   System.out.println(a);
  }
  {
   long l=(long)121.15;
   short a=(short)l;
   System.out.println(l);
   System.out.println(a);
  }
  {
   long l=(long)-101.15;
   byte a=(byte)l;
   System.out.println(l);
   System.out.println(a);
  }
  {
   long l=(long)-128.15;
   long a=(long)l;
   System.out.println(l);
   System.out.println(a);
  }
 }
}
