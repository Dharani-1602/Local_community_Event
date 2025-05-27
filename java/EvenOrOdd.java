import java.util.*;
class Main
  {
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      System.out.println("Enter a number");
      int a=s.nextInt();
      if(a%2==0)
      {
        System.out.println(a+" is Even");
      }
      else
      {
        System.out.println(a+" is Odd");
      }
    }
  }
