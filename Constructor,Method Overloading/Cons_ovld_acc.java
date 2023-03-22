
class Create_account
{
    int acc_no = 100;
    int bal = 500;
    String dob = "1-1-2010";

    Create_account()
    {
        System.out.println("Account information : "+acc_no+"\n"+bal+"\n"+dob);
    }
    Create_account(int acc_no,int bal)
    {
        this.acc_no = acc_no;
        this.bal = bal;
        System.out.println("Account information : "+acc_no+"\n"+bal+"\n"+dob);
    }
    Create_account(int acc_no,int bal,String dob)
    {
        this.acc_no = acc_no;
        this.bal = bal;
        this.dob = dob;
        System.out.println("Account information : "+acc_no+"\n"+bal+"\n"+dob);
    }
}

public class Cons_ovld_acc {
    public static void main(String args[]) {
        Create_account obj1 = new Create_account();
        Create_account obj2 = new Create_account(200, 1000);
        Create_account obj3 = new Create_account(300,10000,"13-08-2002");

    }
}