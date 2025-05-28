import java.util.*;
class Stringreverse
  {
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      System.out.print("Enter a String: ");
      String str=s.next();
      StringBuilder rev= new StringBuilder(str);
      System.out.println(rev.reverse().toString());
    }
  }
