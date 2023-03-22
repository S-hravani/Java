
class Parent1
{
    Parent1()
    {
        System.out.println("I am a parent class constructor");
    }
}

class Child1 extends Parent1
{
    Child1()
    {
        super();
        System.out.println("I am a child class constructor");
    }
}


public class Superkw {
    public static void main(String args[])
    {
        Child1 obj = new Child1();

    }

}
