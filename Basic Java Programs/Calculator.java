import java.util.Scanner;

public class Calculator
{
    public static void main(String args[])
    {
        char operator;
        int num1, num2, result;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the opertor = ");
        operator = input.next().charAt(0);

        System.out.println("Enter the first number = ");
        num1 = input.nextInt();

        System.out.println("Enter Second number = ");
        num2 = input.nextInt();

        switch(operator) {
            case '+':
                result = num1 + num2;
                System.out.println("Addition is = " + result);
                break;

            case '-':
                result = num1 - num2;
                System.out.println("Substraction is = " + result);
                break;

            case '*':
                result = num1 * num2;
                System.out.println("Multiplication is = " + result);
                break;

            case '/':
                result = num1 / num2;
                System.out.println("Division is = " + result);
                break;
        }

    }
}
