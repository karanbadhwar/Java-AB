import java.util.Arrays;
import java.util.Comparator;
import java.util.Arrays;

class My implements Comparator<Integer>
{

    public int compare(Integer i1, Integer i2)
    {
        if(i1 < i2)
            return 1;

        if(i1 > i2)
            return -1;

        return 0;
    }
}


public class Array_Comparator_Demo {
    public static void main(String[] args) {
        Integer a[] = {2,4,6,8,1,3,5,7};
//        int b[] = {2,1,6,8,1,3,5,7};

//        int c[] = Arrays.copyOf(a, a.length);

        Arrays.sort(a, new My());

    for(Integer x : a)
        System.out.println(x);


    }
}

//        System.out.println(Arrays.mismatch(a,b));

//        for(int x: c)
//            System.out.println(x);

//        Arrays.fill(c, 10);

//        System.out.println(Arrays.binarySearch(c,7));