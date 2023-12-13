class NegativeDimensionException extends Exception
{
    @Override
    public String toString()
    {
        return "Dimensions of a Rectangle cannot be Negative";
    }
}

public class Demo_Throw_And_Throws {

    static int area(int l, int b) throws NegativeDimensionException
    {
        if(l < 0 || b < 0)
            throw new NegativeDimensionException();
        return l * b;
    }

    static void meth1() throws NegativeDimensionException
    {
        int arr = area(-10,5);
        System.out.println("Area is: "+arr);
    }

    public static void main(String[] args) {
        try
        {
            meth1();
        }
        catch (NegativeDimensionException e)
        {
            System.out.println(e);
        }

    }

}


//General Propagation of Exception
//static int meth1()
//{
//    return 10 / 0;
//}
//
//static void meth2()
//{
//    int r =  meth1();
//    System.out.println(r);
//}
//
//static void meth3()
//{
//    meth2();
//}
//
//public static void main(String[] args) {
//         try
//        {
//        //    meth3();
//        }
//         catch(ArithmeticException e)
//        {
//            System.out.println(e);
//        }

//}