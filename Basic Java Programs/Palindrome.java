import java.util.Scanner;

public class Palindrome {
    public static void main(String args[])
    {
        int num, temp, digit, sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number = ");
        num = input.nextInt();

        temp = num;
        while(temp>0)
        {
            digit = temp%10;
            sum = (sum*10) + digit;
            temp = temp/10;
        }

        if(num == sum)
        {
            System.out.println(num+" is a Palindrome");
        }
        else {
            System.out.println(num+ " is not a Palindrome");
        }
    }
}
