
class Array
{
    int i;
    void printarray(int array1[])
    {
        for(i =0;i < array1.length; i++)
        {
            System.out.println("Array element = "+array1[i]);
        }
    }

    void printarray(String array2[])
    {
        for(i =0;i < array2.length; i++)
        {
            System.out.println("Array element = "+array2[i]);
        }
    }
}

public class Method_ovld
{
    public static void main(String args[])
    {
        Array obj = new Array();
        int numarray[] = {1,2,3,4,5};
        obj.printarray(numarray);
        String chararray[] = {"S","O","N","U"};
        obj.printarray(chararray);
    }
}
