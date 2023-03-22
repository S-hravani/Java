public class ExceptionDemo2 {
    public static void main(String[] args) {
        String s = null;
        System.out.println("Start of program");

        try
        {
            System.out.println(s.length());
        }
        catch (NullPointerException e)
        {
           System.out.println(e);
            //System.out.println("Enter the valid string");
        }


        System.out.println("End of Program");
    }
}