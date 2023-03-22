import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableDemo
{
    public static void main(String args[]) {
        Hashtable ht = new Hashtable();
        ht.put(1, "ABC");
        ht.put(2,"GHI");
        ht.put(3,"MNO");
        ht.put(4,"PQR");
        ht.put(5,"TUV");

        Enumeration e = ht.keys();
        while(e.hasMoreElements())
        {
            Object o = e.nextElement();
            Integer i = (Integer)o;
            System.out.println(i+" has value "+ht.get(i));
        }

       // ht.get(3);
        System.out.println(ht.get(3));

        ht.remove(2);
        System.out.println(ht);

        ht.replace(4,"Sonu");
        System.out.println(ht);

    }

}
