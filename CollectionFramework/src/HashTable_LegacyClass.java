import java.util.*;
public class HashTable_LegacyClass {
    public static void main(String[] args)
    {
//        Hashtable ht= new Hashtable();

        Hashtable<Integer, String> ht = new Hashtable<>();

        ht.put(1, "A");
        ht.put(2, "B");
        ht.put(3, "C");
        ht.put(4, "D");
        ht.put(5, "E");
        ht.put(6, "F");

        String s = (String) ht.get(3);

        ht.compute(2, (K, V) -> V+"Z");

        ht.computeIfAbsent(7, (K) -> "Z"+K);

//        Enumeration e = ht.elements();
    // For Values
//        Iterator it = e.asIterator();

//        while(e.hasMoreElements())
//        {
//            System.out.println(e.nextElement());
//        }

//        while(it.hasNext())
//        {
//            System.out.println(it.next());
//        }

//        Enumeration e = ht.keys();
//        //Only for Keys
//        while(e.hasMoreElements())
//        {
//            System.out.println(e.nextElement());
//        }


        System.out.println(ht);
    }
}
