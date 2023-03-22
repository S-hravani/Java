import java.util.Scanner;

class Average
{
    void calculate(float a,float b,float c)
    {
        float avg = (a+b+c)/3;
        System.out.println("Average of 3 numbers is = "+avg);
    }
}

public class Average_main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();

        Average obj = new Average();
        obj.calculate(a, b, c);
    }
}