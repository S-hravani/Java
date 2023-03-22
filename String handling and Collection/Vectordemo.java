import java.util.Vector;
import java.util.Iterator;
import java.util.Enumeration;
import java.util.Collections;

public class Vectordemo
{
    public static void main(String args[])
    {
        Vector<Integer> v = new Vector<Integer>();
        v.add(80);
        v.add(50);
        v.add(30);
        v.add(40);
        System.out.println("using iterator");
        Iterator it = v.iterator();
        while(it.hasNext())
        {
            System.out.println(" "+it.next());
        }
        System.out.println("Using Enumerator");

        Enumeration e = v.elements();
        while (e.hasMoreElements())
        {
            System.out.println(e.nextElement());
        }

        System.out.println(v.size());
        Collections.sort(v);
        System.out.println(v);
        v.add(2,25);
        System.out.println(v);
        System.out.println(v.get(2));
        if(v.contains(50))
        {
            System.out.println("present");
        }
        else {
            System.out.println("not present");
        }
        v.remove(3);
        System.out.println(v);

    }
}
