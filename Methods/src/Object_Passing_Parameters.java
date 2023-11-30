public class Object_Passing_Parameters {

    public static void main (String[] args)
    {
        //Method 1 call
        int A[] = {2,4,6,8,10};
        change(A, 2,20);
        for(int i: A)
            System.out.println(i);

        //Method 2 call
        int x = 10;
        change2(x, 20);
        System.out.println("Value of Primitive DataType " +x);


        //Method 3 call
        String str = "Karan";
        welcome(str);
    }

    //Method 1 with Arrays
    static void change (int X[], int index, int value)
    {
        X[index] = value;
    }

    //Method 2 with Primitive Types
    static void change2 (int x, int value)
    {
        x = value;
    }

    //Method 3 with Strings
    static void welcome(String n)
    {
        System.out.println("Welcome Mr./Ms. "+n);
    }
}
