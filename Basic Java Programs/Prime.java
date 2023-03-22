import java.util.Scanner;

public class Prime
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number = ");
        int flag=0;
        int num = input.nextInt();

        for(int i = 2; i<num; i++)
        {
            if(num%i == 0)
            {
                System.out.println(num+" is not a prime number");
                flag=1;
                break;
            }
            else if(flag==0 && i==num-1)
            {
                System.out.println(num+" is a Prime number");

            }
        }
    }
}
