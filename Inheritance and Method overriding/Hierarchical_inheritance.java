
class Employyee
{
    float basic_sal = 50000;
}

class PermanantEmp extends Employyee
{

    void print1()
    {
        float DA = (basic_sal * 150) / 100;
        float total_sal = basic_sal+DA;
        System.out.println("Total salary of permanant employee = "+total_sal);
    }
}

class TemporaryEmp extends Employyee
{

    void print2()
    {
        float DA = (basic_sal * 80) / 100;
        float total_sal = basic_sal+DA;
        System.out.println("Total salary of temporary employee = "+total_sal);
    }
}

public class Hierarchical_inheritance {
    public static void main(String args[])
    {
        PermanantEmp obj1 = new PermanantEmp();
        obj1.print1();
        TemporaryEmp obj2 = new TemporaryEmp();
        obj2.print2();
    }
}
