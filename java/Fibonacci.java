import java.util.*;
class Fibonacci
  {
    public static int Fib(int n)
    {
      if(n==0)
        return 0;
        else if(n==1)
          return 1;
      else
        return Fib(n-1)+Fib(n-2);
    }
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      System.out.print("Enter a postive number: ");
      int n=s.nextInt();
      if (n < 0) {
            System.out.println("Please enter a non-negative integer.");
        } else {
            int result = Fib(n);
            System.out.println("Fibonacci number at position " + n + " is: " + result);
        }
    }
  }
      
