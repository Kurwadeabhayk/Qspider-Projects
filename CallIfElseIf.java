import java.util.Scanner;
class CallIfElseIf
{
 public static void main(String[]args)
 {
  Scanner c= new Scanner(System.in);
  System.out.println("Calling You #@$$");


int ip= c.nextInt();

  if (ip>0 && ip<2) //1
  { 
   System.out.println("Recieved the call");
  }

  else if (ip>1 && ip<3) //2
  { 
   System.out.println("Rejecting the call");
  }

  else if (ip>2 && ip<4) //3
  { 
   System.out.println("is on another call");
  }

  else if (ip>3 && ip<5) //4
  { 
   System.out.println("not answering the call");
  }

  else
  { 
   System.out.println("out of network area");
  }
 }
}
