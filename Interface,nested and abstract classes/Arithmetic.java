import java.util.Scanner;

interface AdvancedArithmetic
{
    int divisor(int n);

}

class MyCalculator implements AdvancedArithmetic
{
    public int divisor(int n)
    {
        int sum = 0, i = 0;
        for(i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                sum=sum+i;
            }
        }
        return sum;
    }
}

public class Arithmetic
{
    public static void main(String args[])
    {
        System.out.print("Enter the number = ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        MyCalculator obj = new MyCalculator();
        int sum = obj.divisor(n);
        System.out.println("I implemented: AdvancedArithmetic= "+sum);

    }
}
