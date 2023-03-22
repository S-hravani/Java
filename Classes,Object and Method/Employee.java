
public class Employee
{
    String name;
    int Year;
    String Address;

    void set(String nm,int yr,String addr)
    {
        name = nm;
        Year = yr;
        Address = addr;

        System.out.println(name+"         "+Year+"          "+Address);
    }

    public static void main(String args[])
    {
        System.out.println("Name" +   "  Year of Joining     " + "Address" );
        Employee e1 = new Employee();
        e1.set("Sam",2000,"68D-WallsStreet");
        Employee e2 = new Employee();
        e2.set("Robert",1994,"64C-WallsStreet");
        Employee e3 = new Employee();
        e3.set("John",2002,"70F-WallsStreet");
    }
}