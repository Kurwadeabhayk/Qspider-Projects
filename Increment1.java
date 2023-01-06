class Increment1
{
 public static void main(String[]args)
 {
  int a=5, b=7, c=3;
  
  b=b++ + ++a;
  a=++a - ++c;
  c=c + a + (b++ - ++b);
  
  System.out.println(a);
  System.out.println(b);
  System.out.println(c);
 }
}
