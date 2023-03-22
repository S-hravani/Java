interface Language
{
    void getType();

    void getVersion();
}


class JavaPgm implements Language
{
    public void getType()
    {
        System.out.println("Platform Independent");
    }

    public void getVersion()
    {
        System.out.println("jdk 1.9");
    }
}

class CPgm implements Language
{
    public void getType()
    {
        System.out.println("Platform dependent");
    }

    public void getVersion()
    {
        System.out.println("c17");
    }
}


public class Interface
{
    public static void main(String args[])
    {
        JavaPgm obj1 = new JavaPgm();
        obj1.getType();
        obj1.getVersion();

        CPgm obj2 = new CPgm();
        obj2.getType();
        obj2.getVersion();

    }
}
