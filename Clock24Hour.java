import java.util.Scanner;
class Clock24Hour
{
 public static void main(String[]args)
 {
  Scanner z = new Scanner(System.in);

  System.out.println("1. ENTER HOUR :");
  System.out.println("2. ENTER MINUTE :");
  System.out.println("3. FOR :- AM= true & PM= false :");

  int ip1= z.nextInt(); //hour
  int ip2= z.nextInt(); //minute
  boolean ip3= z.nextBoolean(); //(AM=true or PM=false)

  if((ip1 == 0) && (ip2>0 && ip2<60) && (ip3 == true))
  {
   System.out.println("in FIRST hour of TODAY");
  }

  else if((ip1 == 1) && (ip2>=0 && ip2<60) && (ip3 == true))
  {
   System.out.println("in SECOND hour of TODAY");
  }

  else if((ip1 == 3) && (ip2>=0 && ip2<60) && (ip3 == true))
  {
   System.out.println("in THIRD hour of TODAY");
  }

  else if((ip1 == 4) && (ip2>=0 && ip2<60) && (ip3 == true))
  {
   System.out.println("in FOUR'TH hour of TODAY");
  }

  else if((ip1 == 5) && (ip2>=0 && ip2<60) && (ip3 == true))
  {
   System.out.println("in FIF'TH hour of TODAY");
  }

  else if((ip1 == 6) && (ip2>=0 && ip2<60) && (ip3 == true))
  {
   System.out.println("in SIX'TH hour of TODAY");
  }

  else if((ip1 == 7) && (ip2>=0 && ip2<60) && (ip3 == true))
  {
   System.out.println("in SEVEN'TH hour of TODAY");
  }

  else if((ip1 == 8) && (ip2>=0 && ip2<60) && (ip3 == true))
  {
   System.out.println("in EIGHT'TH hour of TODAY");
  }

  else if((ip1 == 9) && (ip2>=0 && ip2<60) && (ip3 == true))
  {
   System.out.println("in NINE'TH hour of TODAY");
  }

  else if((ip1 == 10) && (ip2>=0 && ip2<60) && (ip3 == true))
  {
   System.out.println("TEN'TH hour of TODAY");
  }

  else if((ip1 == 11) && (ip2>=0 && ip2<60) && (ip3 == true))
  {
   System.out.println("in ELEVEN'TH hour of TODAY");
  }

  else if(((ip1 == 12) || (ip1 == 0)) && (ip2>=0 && ip2<60) && (ip3 == false))
  {
   System.out.println("in TWELVE'TH hour of TODAY");
  }

  else if((ip1 == 1) && (ip2>=0 && ip2<60) && (ip3 == false))
  {
   System.out.println("in THIRTEEN'TH hour of TODAY");
  }

  else if((ip1 == 2) && (ip2>=0 && ip2<60) && (ip3 == false))
  {
   System.out.println("in FOURTEEN'TH hour of TODAY");
  }

  else if((ip1 == 3) && (ip2>=0 && ip2<60) && (ip3 == false))
  {
   System.out.println("in FIFTEEN'TH hour of TODAY");
  }

  else if((ip1 == 4) && (ip2>=0 && ip2<60) && (ip3 == false))
  {
   System.out.println("in SIXTEEN'TH hour of TODAY");
  }

  else if((ip1 == 5) && (ip2>=0 && ip2<60) && (ip3 == false))
  {
   System.out.println("in SEVENTEEN'TH hour of TODAY");
  }

  else if((ip1 == 6) && (ip2>=0 && ip2<60) && (ip3 == false))
  {
   System.out.println("in EIGHTEEN'TH hour of TODAY");
  }

  else if((ip1 == 7) && (ip2>=0 && ip2<60) && (ip3 == false))
  {
   System.out.println("in NINTEEN'TH hour of TODAY");
  }

  else if((ip1 == 8) && (ip2>=0 && ip2<60) && (ip3 == false))
  {
   System.out.println("in TWENTY'TH hour of TODAY");
  }

  else if((ip1 == 9) && (ip2>=0 && ip2<60) && (ip3 == false))
  {
   System.out.println("in TWENTY ONE'TH hour of TODAY");
  }

  else if((ip1 == 10) && (ip2>=0 && ip2<60) && (ip3 == false))
  {
   System.out.println("in TWENTY SECOND'TH hour of TODAY");
  }

  else if((ip1 == 11) && (ip2>=0 && ip2<60) && (ip3 == false))
  {
   System.out.println("in TWENTY THIRD'TH hour of TODAY");
  }

  else if(((ip1 == 12) || (ip1 == 0)) && (ip2 == 0) && (ip3 == true))
  {
   System.out.println("YAY NEXT DAY");
  }

  else 
  {
   System.out.println("INCORRECT TIME INPUT");
  }
 }
}
  