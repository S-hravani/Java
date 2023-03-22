abstract class Animal1
{
    abstract void MakeSound();

    void eat()
    {
        System.out.println("eating");
    }
}

class Dog1 extends Animal1
{
    void MakeSound()
    {
        System.out.println("Barking");
    }

}

public class AbstractDemo2
{
    public static void main(String args[])
    {

        Dog1 obj = new Dog1();
        obj.eat();
        obj.MakeSound();
    }

}
