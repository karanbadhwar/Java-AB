class A{}

interface Ib{}

interface Ic{}

/**
 *
 * @param <T> Extends A - Class, Ib & Ic - Interface
 */
//class DDG <T extends A &  Ib & Ic>

class DDG<T>
{
    @SuppressWarnings("unchecked")
    T[] A = (T[]) new Object[10];


    int length = 0;

    public void append(T value)
    {
        A[length++] = value;
    }

    public void display()
    {
        for(int i = 0; i <length; i++)
        {
            System.out.println(A[i]);
        }
    }
}

public class DosDontGenerics {

    static void fun(DDG<?> obj)
    {
        obj.append(null);
    }
    public static void main(String[] args) {

        DDG<String> dg = new DDG<String>();

//        DDG<?> dg = new DDG<String>();

//        dg.append("Hel");

        fun(dg);
    }
}
