import java.util.Scanner;
class UserCall
{
 public static void main(String[]args)
 {
  Scanner c= new Scanner(System.in);
  System.out.println("Calling from user input 1 :");
	int ip= c.nextInt();
  System.out.println("Calling from user input 2 :");
	int ip1= c.nextInt();

  if ((ip>0 && ip<2) || (ip1>0 && ip1<2)) //1
  { 
   System.out.println("HURRAH :-) Recieved the call");
  }

  else if (ip>1 && ip<3) //2
  { 
   System.out.println("OPPS :-| Rejecting the call");
  }

  else if (ip>2 && ip<4) //3
  { 
   System.out.println("OHH :-( is on another call");
  }

  else if (ip>3 && ip<5) //4
  { 
   System.out.println(" OPPS !!! not answering the call!!! ");
  }

  else
  { 
   System.out.println("out of network area");
  }
 }
}
