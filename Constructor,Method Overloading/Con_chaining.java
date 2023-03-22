

//default constructor will call another constructor using this keyword from same class
class Constructor
{
    Constructor()          //default
    {
        this(5);                   //calls constructor 2
        System.out.println("Default Constructor");
    }

    Constructor(int x)               //parameterised
    {
        this(5,20);              //calls constructor 3
        System.out.println(x);
    }

    Constructor(int x, int y)       //parameterised
    {
        System.out.println(x*y);
    }
}

public class Con_chaining {

    public static void main(String args[]) {
        //invokes default constructor first
        new Constructor();
    }
}
