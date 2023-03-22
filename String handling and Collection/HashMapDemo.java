import java.util.Enumeration;
import java.util.HashMap;
import java.util.Enumeration;


public class HashMapDemo {
    public static void main(String args[])
    {
        HashMap<Integer,String> hm = new HashMap<Integer,String>();
        hm.put(1,"ABC");
        hm.put(2,"MNO");
        hm.put(3,"JKL");
        hm.put(4,"VCN");
        hm.put(5,"XYZ");

        System.out.println(hm);

        System.out.println(hm.get(3));

        hm.remove(2);
        System.out.println(hm);

        hm.replace(3,"NEW");
        /*Enumeration e = hm.keySet();
        while(e.hasMoreElements())
        {
            Object o = e.nextElement();
            Integer i =(Integer)o;
            System.out.println(i+" has value "+hm.get(i));
        }*/

        System.out.println(hm);
    }

}
