public class ExceptionDemo4
{
    public static void main(String[] args) {

        try
        {
            Class.forName("Hello");
        }

        catch(ClassNotFoundException e)
        {
            System.out.println(e);
            //e.printStackTrace();
        }
    }
}
