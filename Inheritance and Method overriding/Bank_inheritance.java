class Parent
{
    static int bank_balance = 1000;
    void deposite()
    {
        bank_balance = bank_balance + 1000;
        System.out.println("money deposited is 1000");
    }
    void withdraw()
    {
        bank_balance = bank_balance -200;
        System.out.println("money withdrawed is 200");
    }
}

class Son1 extends Parent
{
    void display()
    {
        System.out.println("Final bank bal = "+bank_balance);
    }
}


public class Bank_inheritance {
    public static void main(String args[])
    {
        Son1 obj1 = new Son1();
        Son1 obj2 = new Son1();
        obj1.deposite();
        obj2.withdraw();
        obj1.display();
    }
}
