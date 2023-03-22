
class Parameterised
{
    int roll;
    String name;
    Parameterised(int r, String nm)
    {
        roll = r;
        name = nm;
    }

    void display()
    {
        System.out.println("Roll no = "+roll);
        System.out.println("Name = "+name);
    }
}

public class Paracon
{
    public static void main(String args[]) {
        Parameterised obj = new Parameterised(22, "Shravani");
        Parameterised obj1 = new Parameterised(21, "XYZ");
        obj.display();
        obj1.display();
    }
}
