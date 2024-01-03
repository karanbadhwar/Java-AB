class GMDemo <T>
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

class GrandParent {}

class Parent extends GrandParent{}

class GrandChild extends Parent{}

public class GenericMethods {

    //Generic Method
    /*
    static <E> void show(E... list)
    {
        for(E x: list)
        {
            System.out.println(x);
        }
    }
    */

    static void fun(GMDemo<? extends Number > obj)
    {
        obj.display();
    }

    static void superFun(GMDemo<? super GrandChild> obj)
    {

    }


    public static void main(String[] args)
    {
//        show(new String[]{"Hi", "Hello", "Heya"});
//
//        show(new Integer[]{10,20, 30, 40});
//
//        show(100,200,300,400);

        GMDemo<Integer> gm = new GMDemo<>();
        gm.append(10);
        gm.append(20);

        GMDemo<String> gm1 = new GMDemo<>();
        gm1.append("Hi");
        gm1.append("Hello");

        fun(gm);
//        fun(gm1); // Error as not a sub class of Number Class

        GMDemo<Parent> gmd = new GMDemo<>();
        superFun(gmd);

        GMDemo<GrandChild> ggc = new GMDemo<>();
        superFun(ggc);


    }
}
