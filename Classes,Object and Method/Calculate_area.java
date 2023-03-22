public class Calculate_area
{
    float length,base,height,areas,areat;
    void area(int l)
    {
        length = l;
        areas = length * length;
        System.out.println("Area of Square = "+areas);
    }

    void area(int b,int h)
    {
        base = b;
        height = h;
        areat = base * height;
        System.out.println("Area of Triangle = "+areat);
    }

    public static void main(String args[])
    {
        Calculate_area obj = new Calculate_area();
        obj.area(5);
        obj.area(6,4);
    }
}
