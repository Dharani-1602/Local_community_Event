import java.util.*;
class Main
  {
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      System.out.print("Enter the number of Array elements: ");
      int n=s.nextInt();
      System.out.println("Enter the array elements: ");
      int arr[]=new int[n];
      for(int i=0;i<n;i++)
        {
          arr[i]=s.nextInt();
        }
      int sum=0;
      for(int i=0;i<n;i++)
        {
          sum+=arr[i];
        }
      System.out.println("Sum of array elements is: "+sum);
      double avg=(double)sum/n;
      System.out.println("Average of array elements is: "+avg);
    }
  }
