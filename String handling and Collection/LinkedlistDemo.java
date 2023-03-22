import java.util.LinkedList;

public class LinkedlistDemo
{
    public static void main(String args[])
    {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(10);
        list.add(20);
        list.addFirst(5);
        list.addLast(30);
        list.add(2,15);
        System.out.println(list);
        System.out.println(list.get(3));
        System.out.println(list.getFirst());
        System.out.println((list.getLast()));
        list.remove(2);
        System.out.println(list);
        list.removeFirst();
        list.removeLast();
        System.out.println(list);

        if(list.contains(25))
        {
            System.out.println("present");
        }
        else
        {
            System.out.println("not present");


        }
    }
}