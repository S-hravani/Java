import java.util.*;

public class Treesetdemo {
    public static void main(String args[])
    {
        TreeSet<Integer> t = new TreeSet<Integer>();
        t.add(10);
        t.add(20);
        t.add(30);
        t.add(40);
        Iterator it=t.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
        System.out.println("Size of tree set is = "+t.size());
        System.out.println(t.first());
        System.out.println(t.last());
        t.pollFirst();
        System.out.println(t);
        t.pollLast();
        System.out.println(t);
        t.add(60);
        t.add(70);
        t.add(80);
        System.out.println(t);
        System.out.println(t.headSet(60));
        System.out.println((t.tailSet(70)));
        System.out.println(t.subSet(20,70));


    }
}
