public class Method_Writting_Practice {

//    static int max(int x, int y)
//    {
//        if(x>y)
//            return x;
//        else
//            return y;
//    }

    static void inc(int x)
    {
        x++;
        System.out.println(x);
    }


    public static void main (String[] args)
    {
        int a = 15, b =10, c;
//        c = max(a,b); //To access without creating Instance, method should be Static
//        System.out.format("%d \n", c);

//        Method_Writting_Practice mp = new Method_Writting_Practice(); // Creating an Instance so that we can access non-static method
//            System.out.println(mp.max(a,b));

        inc(a); // Call by Value
        System.out.println(a);

    }
}
