public class ExceptionDemo3 {
    public static void main(String[] args) {
        int a[] = new int[5];

        try {
            a[6] = 10;

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
           // System.out.println("Array size is full");
        }

        System.out.println("Thank you");
    }
}