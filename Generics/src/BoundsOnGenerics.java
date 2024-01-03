class Array<T, K>
{
    @SuppressWarnings("unchecked")
    T[] A = (T[]) new Object[10];

    K a;

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

class Array2 extends Array <String, String>
{

}

class Array3<T> extends Array<T,String>
{}

/*
    public static void main(String[] args)
    {
        Array<Integer, String> a1 = new Array<>();
        Array2 a2 = new Array2();

        a2.append("abc");
        a2.append("def");

        a2.display();

        Array3<Character> a3 = new Array3<>();

        a3.append('a');
        a3.append('b');

        a3.display();
    }
 */

class BoundedType <T extends Number>
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

interface a {}

class B implements a{}

class C implements a{}

class BoundedTypeInterface <T extends a>
{
    @SuppressWarnings("unchecked")
    T[] A = (T[]) new Object[10];

    int length;
    public void append(T value)
    {
        A[length++] = value;
    }

}

public class BoundsOnGenerics {
    public static void main(String[] args) {
        BoundedType<Float> bt = new BoundedType<>();
        BoundedType<Double> bt2 = new BoundedType<>();
//        BoundedType<String> bt3 = new BoundedType<>(); //Error

        bt.append(12.5f);
        bt.append(17.5f);
        bt.append(9.75f);

        BoundedTypeInterface<B> bti = new BoundedTypeInterface<>();

        bti.append(new B());
    }

}
