
import java.util.Scanner;

public class Factorial
{
    public static void main(String args[])
    {
        int i,fact = 1;

       // int num = Integer.parseInt(args[0]);
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number = ");

       int num = input.nextInt();

        for(i=1;i<=num;i++)
        {
            fact = fact * i;

        }
        System.out.println("Factorial of number is = "+fact);
    }
}
