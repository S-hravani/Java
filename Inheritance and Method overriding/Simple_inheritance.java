import java.util.Scanner;
class Employe
{
    int salary = 100000;
}

class Programmer extends Employe
{
    void print() {
        System.out.println("Enter the bonus = ");
        Scanner sc = new Scanner(System.in);
        int bonus = sc.nextInt();
        System.out.println("Salary = "+salary);
        System.out.println("Bonus = "+bonus);

        System.out.println("salary with bonus = "+(salary+bonus));
    }
}



public class Simple_inheritance {
    public static void main(String args[])
    {
        Programmer obj = new Programmer();
        obj.print();
    }
}
