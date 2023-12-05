class Test
{
    public int max(int a, int b)
    {
        return a>b?a:b;
    }

    public int max (int a, int b, int c)
    {
        if(a>b && a>c) return a;
        else if (b>c) return b;
        return c;
    }
}

public class PolyMorphism_Using_OverLoading {
    public static void main (String ...args)
    {
        Test t = new Test();

        t.max(10,5);
        t.max(10,5, 15);
    }
}

//It is Compile-Time Polymorphism, as It is pre-decided, compiler Decided which method to choose because of the Arguments
// Overloaded methods can be in teh same class or even in Parent-Child class as well