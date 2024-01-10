import java.util.*;
import java.util.Map.*;

public class TreeHashDemo {
    public static void main(String[] args) {
        TreeMap<Integer, String> tm = new TreeMap<>(Map.of(0,"A", 1, "B", 2, "C", 3, "D"));

        tm.put(4, "E");
        tm.put(5, "F");
        tm.put(6, "G");
        System.out.println(tm);

        System.out.println("Ceil Method "+tm.ceilingEntry(5).getValue());

        System.out.println("FloorMethod "+tm.floorEntry(8));

        System.out.println("Entry Set Method "+tm.entrySet());

        System.out.println("Get Method "+tm.get(5));


//        Map.Entry<Integer, String> e = tm.firstEntry();
        Entry<Integer, String> e = tm.firstEntry();

        System.out.println("Entry Ref Obj: "+e.getValue());
        System.out.println(e.hashCode());


    }
}
