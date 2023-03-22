import java.util.Scanner;

public class Strong
{
    int calculate(int n)
    {
        int i,fact = 1;
        for(i = 1;i <= n; i++)
        {
            fact = fact*i;
        }
        return fact;
    }


    public static void main(String args[]) {
        int temp, num, digit, val, sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number = ");
        num = input.nextInt();
        Strong obj = new Strong();

        temp = num;
        while (temp > 0) {
            digit = temp % 10;
            val = obj.calculate(digit);
            sum = sum + val;
            temp = temp / 10;

        }

        if (num == sum) {
            System.out.println(num + " is strong");
        } else {
            System.out.println(num + " is not strong");
        }

    }
}