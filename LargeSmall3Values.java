class LargeSmall3Values
{
 public static void main(String[]args)
 {
  {
   int a=710;
   int b=611;
   int c=458;
   
   int ans = a > b ? (a>c ? a : c) : (b>c ? b : c) ;
   int res = c > (a>b ? a : b) ? c : (a>b ? a : b);
   System.out.println("The largest of "+a+" , "+b+" & "+c+" is : "+ ans);
   System.out.println("The largest of "+a+" , "+b+" & "+c+" is : "+ res);
  } 
 }
} 