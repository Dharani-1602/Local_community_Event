import java.util.*;
class TargetNumber
  {
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      Random random=new Random();
      int target=random.nextInt(100);
      int guess;
      int attempts=0;
      System.out.println("Welcome to the number playing game!");
      System.out.println("I am thinking of number between 1 and 100");
      do
        {
          System.out.print("Enter your guess: ");
          guess=s.nextInt();
          attempts++;
          if(guess>target)
          {
            System.out.println("Too high.Try again");
          }
          else if(guess<target)
          {
            System.out.println("Too Low.Try again");
          }
          else 
          {
            System.out.println("Congratulations you found number in "+attempts+" attempts.");
          }
        }
        while(guess!=target);
        }
  }
