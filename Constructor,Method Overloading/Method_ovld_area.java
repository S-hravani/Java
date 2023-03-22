
class CalculateArea
{
    void area(int base,int height)
    {
        double triangle = 0.5*base*height;
        System.out.println("Area of Triangle = "+triangle);
    }

    void area(int side)
    {
        double square = side*side;
        System.out.println("Area of Square = "+square);
    }
}

public class Method_ovld_area {
    public static void main(String args[])
    {
        CalculateArea obj1 = new CalculateArea();
        obj1.area(5,4);
        CalculateArea obj2 = new CalculateArea();
        obj2.area(5);

    }
}
