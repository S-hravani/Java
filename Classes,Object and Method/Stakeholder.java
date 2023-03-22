import java.util.Scanner;
class Faculty
{
    String Faculty_name;
    int Faculty_id;
    void printdetails1(String fname,int fid)
    {
        Faculty_name = fname;
        Faculty_id = fid;
        System.out.println("Faculty name is = "+Faculty_name);
        System.out.println("Faculty id is = "+Faculty_id);
    }

}

class Student
{
    String Student_name;
    int Student_id;
    void printdetails2(String sname,int sid)
    {
        Student_name = sname;
        Student_id = sid;
        System.out.println("Student name is = "+Student_name);
        System.out.println("Student id is = "+Student_id);
    }

}
public class Stakeholder
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Faculty name is = ");
        String F_name =  sc.nextLine();
        System.out.println("Faculty id is = ");
        int F_id =  sc.nextInt();
        System.out.println("Student name is = ");
        String S_name =  sc.nextLine();
        System.out.println("Student id is = ");
        int S_id =  sc.nextInt();
        System.out.println("Student name is = ");
        Faculty f = new Faculty();
        f.printdetails1(F_name,F_id);
        Student s = new Student();
        s.printdetails2(S_name,S_id);
    }
}
