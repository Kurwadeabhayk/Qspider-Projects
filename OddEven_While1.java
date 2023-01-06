import java.util.Scanner;
class OddEven_While1
{
 public static void main(String[]args)
 {
  Scanner a= new Scanner(System.in);
  System.out.println("Enter a Starting Number: ");

  int i =a.nextInt();
     
  System.out.println("Enter a Ending number: ");

  int j =a.nextInt();


if (i<=j)
{
  while(i%2==0)
  {
	 // if (i%2==0)
	 // {
		 // System.out.println(i%2==0) ;
		  System.out.println(i+" even");
		  i++;
		  //break;
	  //}  
  }

  //System.out.println("Enter a Ending number: ");
//  while (j%2!=0)
 // {
	 //if (j%2!=0)
	 //{
		  //System.out.println(j%2!=0);
		  //System.out.println(j+" odd");
		  //j++;
		  //break;
		  
	//}
  //}
}
 }
}
  
