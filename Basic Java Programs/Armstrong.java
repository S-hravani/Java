import java.util.Scanner;
import java.lang.Math;

public class Armstrong
{
    public static void main(String args[])
    {
        int num,temp,t,r,c=0,digit,sum = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number = ");
        num = input.nextInt();

        temp = num;
        t = num;

        while(t>0)
        {
            r = t%10;
            c++;
            t = t/10;
        }

        System.out.println("Count = "+c);

        while(temp>0)
        {
            digit = temp % 10;
            sum = sum + (int)Math.pow(digit,c);
            temp = temp / 10;
        }

        if(num == sum)
        {
            System.out.println("Given number is Armstrong number");
        }
        else
        {
            System.out.print("Given number is not Armstrong number");

        }
    }

}
