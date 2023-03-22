import java.util.*;

public class ExceptionDemo6 {
    static void validate(int age)
    {
        if(age<18)

        {
            throw new ArithmeticException("Invalid Age");
        }
        else
        {
            System.out.println("Eligible");
        }

    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Age = ");
        int age = sc.nextInt();
        validate(age);
    }
}
