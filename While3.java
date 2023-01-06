class While3
{
 public static void main(String[]args)
 { 
  char lower ='a';
  char upper ='A';
 
  while(lower <='z')
  {
   System.out.println(lower);
   lower++;
  }

  while (upper <='Z')
  {
   System.out.println(upper);
   ++upper;
  }
 }
}