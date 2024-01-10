import java.util.*;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>(List.of(10,20,30,50,70,10,40));

        ts.add(25);

        System.out.println(ts.ceiling(55)); // It will equal or greater number



        TreeSet ts1 = new TreeSet();

        ts1 = (TreeSet) ts.clone();

        System.out.println("Clone: "+ts1);

        System.out.println(ts);
    }
}
