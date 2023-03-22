import java.util.Scanner;

public class Max_3
{
    public static void main(String args[])
    {
        int num1,num2,num3;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number = ");
        num1 = input.nextInt();

        System.out.print("Enter second number = ");
        num2 = input.nextInt();

        System.out.print("Enter third number = ");
        num3 = input.nextInt();

        if(num1>num2)
        {
            if(num1>num3)
            {
                System.out.print("Maximum = "+num1);
            }
            else
            {
                System.out.print("Maximum = "+num3);
            }

        }

        else
        {
            if(num2>num3)
            {
                System.out.print("Maximum = "+num2);
            }
            else
            {
                System.out.print("Maximum = " + num3);
            }
        }
    }
}
