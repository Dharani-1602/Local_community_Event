import java.util.*;
class Leapyear
  {
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      System.out.print("Enter the year ");
      int a=s.nextInt();
      if(((a%4==0)&&(a%100!=0))||(a%400==0))
      {
        System.out.println(a+" is Leap Year");
      }
      else
      {
        System.out.println(a+" is not Leap Year");
      }
    }
  }
