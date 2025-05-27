import java.util.*;
class Method
  {
    void sum(int a,int b)
    {
      System.out.println("Sum is: "+(a+b));
    }
    void sum(double c,double d)
    {
      System.out.println("Sum is: "+(c+d));
    }
    void sum(int e,int f,int g)
    {
      System.out.println("Sum is: "+(e+f+g));
    }
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      Method obj=new Method();
      int a=s.nextInt();
      int b=s.nextInt();
      double c=s.nextDouble();
      double d=s.nextDouble();
      int e=s.nextInt();
      int f=s.nextInt();
      int g=s.nextInt();
      obj.sum(a,b);
      obj.sum(c,d);
      obj.sum(e,f,g);
    }
  }
      
