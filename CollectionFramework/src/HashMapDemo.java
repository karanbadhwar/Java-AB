import java.util.*;


public class HashMapDemo {
    public static void main(String[] args) {
//        HashMap<Integer, String> hm = new HashMap<>(20, 0.5f);
        HashMap<Integer, String> hm = new HashMap<>(Map.of(0, "A", 1, "B", 2, "C", 3, "D"));

        hm.put(4, "E");
        hm.put(5, "F");
        hm.put(9, "Z");
        hm.put(3, "ggg");
        hm.put(6, "G");

//        Map.Entry<Integer,String> e = hm.;

        System.out.println(hm);
        System.out.println(hm.get(2));
    }
}
