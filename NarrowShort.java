class NarrowShort
{
 public static void main(String[]args)
 {
  {
   short s=(short)'g';
   short a=(short)s;
   System.out.println(s); //103
   System.out.println(a); //103
  }
  {
   short s=(short)-112;
   byte a=(byte)s;
   System.out.println(s); //-112
   System.out.println(a); //-112
  }
 }
}