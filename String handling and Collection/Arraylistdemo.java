import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Arraylistdemo {

    public static void main(String args[])
    {
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        //System.out.println(al);
        //method 1
        Iterator it = al.iterator();
        //method 2
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
        System.out.println(al.size());
        Collections.sort(al);
        System.out.println(al);
        al.add(2,15);
        System.out.println(al);
        System.out.println(al.get(3));
        System.out.println(al);

        if(al.contains(30))
        {
            System.out.println("30 is present");
        }
        else
        {
            System.out.println("30 is not present");
        }
        al.remove(4);
        System.out.println(al);

    }
}
