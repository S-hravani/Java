public class Student1
{
    String name;
    int roll_no;
    Student1(String nm, int rno)
    {
        name = nm;
        roll_no = rno;
    }

    void display()
    {
        System.out.println("Name of Student = "+name);
        System.out.println("Roll number = "+roll_no);
    }

    public static void main(String args[])
    {
        Student1 obj = new Student1("Dhanashri",9);
        obj.display();
        Student1 obj1 = new Student1("shravani",22);
        obj1.display();
    }
}
