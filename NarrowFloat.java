class NarrowFloat
{
 public static void main(String[]arg)
 {
  {
   float f=(float) 96l;
   float a=(float) f;
   System.out.println(f);
   System.out.println(a);
  }
  {
   float f=(float) 'Y';
   long a=(long) f;
   System.out.println(f);
   System.out.println(a);
  }
  {
   float f=(float) 99.65d;
   int a=(int) f;
   System.out.println(f);
   System.out.println(a);
  }
  {
   float f=(float) 105.21;
   char a=(char) f;
   System.out.println(f);
   System.out.println(a);
  }
  {
   float f=(float) 98;
   short a=(short) f;
   System.out.println(f);
   System.out.println(a);
  }
  {
   float f=(float) 108;
   byte a=(byte) f;
   System.out.println(f);
   System.out.println(a);
  }
 }
}