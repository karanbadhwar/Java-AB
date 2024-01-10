import java.util.*;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();

        LinkedList<Integer> ll1= new LinkedList<>(List.of(50,60,70,80,90));

        ll.add(10);

        ll.add(0,5);

        ll.addAll(1, ll1);

        ll.add(5,70);

        ll.set(6,100);


        ll.addFirst(3);

        ll.addLast(200);

        System.out.println(ll);

//        Iterator it = ll.descendingIterator();
//
//        System.out.println(it.next());

        System.out.println(ll.peek()); // returns teh First element

        System.out.println(ll.poll()); // remove the First element

        System.out.println(ll);
    }
}
