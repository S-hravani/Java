import java.util.Scanner;

public class Employee_sal
{
    double Salary = 0;
    int hours = 0;
    void get_info()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Salary = ");
        Salary = sc.nextDouble();
        System.out.println("Enter the working hours = ");
        hours = sc.nextInt();
    }

    void AddSal()
    {

        if(Salary<500)
        {
            Salary = Salary + 10;
            System.out.println("salary = "+Salary);
        }

    }

    void AddWork()
    {
        if(hours>6)
        {
            Salary = Salary + 5;
            System.out.println("Salary = "+Salary);
        }
    }

    public static void main(String args[])
    {
        Employee_sal obj = new Employee_sal();
        obj.get_info();
        obj.AddSal();
        obj.AddWork();
    }
}
