import java.util.*;
class Typeconversion {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the double number: ");
        double a=s.nextDouble();
        int b = (int) a;
        System.out.println("Before type casting: "+a);
        System.out.println("After type casting: "+b);
        System.out.print("Enter Integer number: ");
        int c =s.nextInt();
        double d = c;
        System.out.println("Before type casting: "+c);
        System.out.println("After type casting: "+d);
    }
}
