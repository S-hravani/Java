import java.util.Scanner;

class Solution
{
    int num;
    void takeip()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number = ");
        num = sc.nextInt();
    }

    class Checkprime
    {
        void prime()
        {
            int flag=0;

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
}


public class NestedClass
{
    public static void main(String args[])
    {
        Solution obj = new Solution();
        Solution.Checkprime obj2 = obj.new Checkprime();
        obj.takeip();
        obj2.prime();
    }
}
