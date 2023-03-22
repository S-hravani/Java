import java.util.Scanner;

public class Area
{
    int length,breadth;
    void setdim(int l,int b)
    {
        length = l;
        breadth = b;
    }

    int getarea()
    {
        return length * breadth;
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int b = sc.nextInt();
        Area obj = new Area();
        obj.setdim(l,b);
        System.out.println("Area of rectangle is = "+obj.getarea());
    }
}