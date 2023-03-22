abstract class Animal
{
    abstract void run();

}


class Dog extends Animal
{
    void run()
    {
        System.out.println("Running");
    }
}

class AbstractClass1
{
    public static void main(String args[])
    {
        Dog d = new Dog();
        d.run();
    }
}


