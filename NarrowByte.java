class NarrowByte
{
 public static void main(String[]args)
 {
  byte b=(byte) 101.5;
  byte a=(byte)b;
  System.out.println(b); //101
  System.out.println(a); //101
 }
}