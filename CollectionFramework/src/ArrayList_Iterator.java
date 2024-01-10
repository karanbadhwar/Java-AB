import java.util.*;
import java.util.function.Consumer;

public class ArrayList_Iterator {
    public static void main(String[] args) {
        ArrayList<Integer> al1 = new ArrayList<>(20);

        ArrayList<Integer> al2 = new ArrayList<>(List.of(50,60,70,80,90));


        al1.add(10);

        al1.add(0,5);

        al1.addAll(1,al2);

        al1.add(5,70);

        al1.set(5, 111);

//        Iterator c = al1.iterator();
//
//        System.out.println(c.hasNext());
//        System.out.println(c.next());
//        System.out.println(c.next());
//        System.out.println(c.);

//        for( Iterator<Integer> it = al1.iterator(); it.hasNext(); )
////        {
////            Integer x = it.next();
////            System.out.println(x);
////        }

        //ForEach loop takes in the Consumer Functional Interface
//        al1.forEach((x) -> {
//            System.out.println(x);
//        });

        //Iterator
        /*
        Iterator<Integer> it = al1.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
        */

        //ListIterator
//        for(ListIterator<Integer> li = al1.listIterator(); li.hasNext();)
//        {
//            System.out.println(li.next());
//        }

        //ForEach

//        al1.forEach(n -> System.out.println(n));

//        al1.forEach(System.out::println);

//        class Demo<T> implements Consumer<T>
//        {
//            public void accept(T t)
//            {
//                System.out.println(t);
//            }
//        }
//
//        Demo<Integer> d= new Demo<>();
//
//        al1.forEach(d);




    }
}
