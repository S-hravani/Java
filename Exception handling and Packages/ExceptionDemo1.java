import java.util.Scanner;


public class ExceptionDemo1 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();


        try
        {
            int result = a/b;
            System.out.println(result);

        }
        catch(ArithmeticException e)
        {
            //System.out.println("can't able to divide by zero");
            System.out.println(e);
        }

        System.out.println("hello");
    }

}
