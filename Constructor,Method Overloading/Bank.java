import java.util.Scanner;
class bank1
{
    static  int bal = 500;

    void deposite()
    {
        System.out.println("Enter the amount you want to deposite = ");
        Scanner sc = new Scanner(System.in);
        int amount1 = sc.nextInt();
        bal = bal + amount1;
        System.out.println("Amount deposited");
    }

    void withdraw()
    {
        System.out.println("Enter the amount you want to withdraw = ");
        Scanner sc = new Scanner(System.in);
        int amount2 = sc.nextInt();


            bal = bal - amount2;
            System.out.println("balance = "+bal);

        if(bal<100)
        {
            System.out.println("low balance");
        }

    }
}



public class Bank
{
    public static void main(String args[])
    {
        bank1 obj1 = new bank1();
        bank1 obj2 = new bank1();
        bank1 obj3 = new bank1();

        obj1.deposite();
        obj1.withdraw();
        System.out.println("Balance in account = "+obj1.bal);
        System.out.println("Balance in account = "+obj2.bal);
        System.out.println("Balance in account = "+obj3.bal);
    }
}
