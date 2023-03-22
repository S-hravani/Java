
class Grandfather
{
    void showg()
    {
        System.out.println("I am grandfather");
    }
}

class Father extends Grandfather
{
    void showf()
    {
        System.out.println("I am Father");
    }
}

class Son extends Father{
    void shows()
    {
        System.out.println("I am Son");
    }
}

class Daughter extends Father{
    void showd()
    {
        System.out.println("I am Daughter");
    }
}


public class Hybrid_inheritance {
    public static void main(String args[])
    {
        Daughter obj1 = new Daughter();
        obj1.showg();
        obj1.showf();
        obj1.showd();
        Son obj2 = new Son();
        obj2.showg();
        obj2.showf();
        obj2.shows();
    }


}
