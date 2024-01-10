import java.util.*;

public class LinkedHashSet_Demo {
    public static void main(String[] args) {
        LinkedHashSet<String> lhs = new LinkedHashSet<>(10);

        lhs.add("A");
        lhs.add("B");
        lhs.add("D");
        lhs.add("E");
        lhs.add("C");
        lhs.add("F");
        lhs.add("G");
//        lhs.add("G"); // it won't let it insert

//        System.out.println(lhs);

        Iterator<String> itr = lhs.iterator();

        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}
