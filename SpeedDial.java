import java.util.Scanner;
class SpeedD
{
 public static void main(String[]args)
 {
  Scanner z = new Scanner(System.in);
  System.out.println("__________SPEED DIAL________");
  System.out.println("1. DAD");
  System.out.println("2. MOM");
  System.out.println("3. BRO");
  System.out.println("4. SIS");
  System.out.println("5. BF");
  System.out.println("6. GF");
  System.out.println("PRESS YOUR NUMBER FOR 3 SEC");
  
  int ip= z.nextInt();
  switch (ip)
   {
    case 1:
    {
    System.out.println("CALLING DAD");
    break;
    }

    case 2:
    {
    System.out.println("CALLING MOM");
    break;
    }

    case 3:
    {
    System.out.println("CALLING BRO");
    break;
    }

    case 4:
    {
    System.out.println("CALLING SIS");
    break;
    }

    case 5:
    {
    System.out.println("CALLING BF");
    break;
    }

    case 6:
    {
    System.out.println("CALLING GF");
    break;
    }
   
    default:
    {
     System.out.println("NO CONTACT ASSISGNED");
    }  

   }
 }
}