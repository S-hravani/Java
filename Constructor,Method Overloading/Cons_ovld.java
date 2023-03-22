
class Student_name
{
    String name;
    Student_name()
    {
        name = "Unknown";
        System.out.println(name);
    }

    Student_name(String nm)
    {
        name = nm;
        System.out.println("Name = "+name);
    }
}
public class Cons_ovld
{
    public static  void main(String args[])
    {
        Student_name obj = new Student_name("Shravani");
        Student_name obj1 = new Student_name();
    }
}
