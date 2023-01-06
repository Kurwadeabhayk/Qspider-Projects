class Increment2
{
 public static void main(String[]args)
 {
  int a=26, b=7, c=12, d=4;
  a++;
  d=++a - --c;
  ++d;
  b=d++ - b++;
  --b;
  --a;

  System.out.println(a);
  System.out.println(b);
  System.out.println(c);
  System.out.println(d);
 }
}
