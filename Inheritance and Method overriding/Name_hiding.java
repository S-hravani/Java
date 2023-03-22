
class Parent2
{
    String name = "Dhanashri";
}

class Child2 extends Parent2 {
    String name = "Shravani";

    void Print_name() {
        System.out.println("Parent name is : "+super.name);
        System.out.println("Child name is : "+name);
    }
}
public class Name_hiding {
    public static void main(String args[])
    {
        Child2 obj = new Child2();
        obj.Print_name();
    }
}
