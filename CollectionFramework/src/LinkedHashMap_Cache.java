import java.util.*;

public class LinkedHashMap_Cache {
    public static void main(String[] args) {

        /* With Access Order*/
        LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>(5, .75f, true){
            protected boolean removeEldestEntry(Map.Entry e)
            {
                return size() > 5;
            }
        };




        /* Without Access Order*/
//        LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>(5){
//            protected boolean removeEldestEntry(Map.Entry e)
//            {
//                return size() > 5;
//            }
//        };


        lhm.put(1, "A");
        lhm.put(2, "B");
        lhm.put(3, "C");
        lhm.put(4, "D");
        lhm.put(5, "F");
        lhm.put(6, "G");
        lhm.put(9, "I");
        lhm.put(8, "H");



        String s = lhm.get(2);
        System.out.println(lhm);

        s= lhm.get(5);
        System.out.println(lhm);

        s = lhm.get(4);


        System.out.println(lhm);
    }
}
