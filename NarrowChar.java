class NarrowChar
{
 public static void main(String[]args)
 {
  {
   char c=(char) 101.12;
   char a=(char)c;
   System.out.println(c); //e
   System.out.println(a); //e
  }
  {
   char c=(char) 122;
   short a=(short)c;
   System.out.println(c); //z
   System.out.println(a); //122
  }
  {
   char c=(char) -49;
   byte a=(byte)c;
   System.out.println(c); //?
   System.out.println(a); //-49
  }
 }
}