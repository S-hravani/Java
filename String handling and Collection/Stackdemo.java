import java.util.*;

public class Stackdemo {
    public static void main(String args[])
    {
        Stack<Integer> s = new Stack<Integer>();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        System.out.println(s);
        s.pop();
        System.out.println(s);
        System.out.println(s.empty());
        s.search(30);
        Iterator it = s.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}
