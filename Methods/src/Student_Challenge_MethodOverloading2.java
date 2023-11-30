public class Student_Challenge_MethodOverloading2 {

    //Methods - Overloaded Method to Reverse an Int or Array
    //--------------------------------------------------------
    static int reverse (int x)
    {
        int reverse = 0;
        while ( x % 10 != 0)
        {
            reverse = (reverse * 10) + (x % 10);
            x = x / 10;
        }
        return reverse;
    }


    static int[] reverse (int A[])
    {
        int[] B = new int[A.length];

        for(int i = A.length - 1, j = 0; i >= 0 ; i--, j++)
        {
            B[j] = A[i];
        }
        A = B;
        B = null;
        return A;
    }

    public static void main (String[] args)
    {

        //Overloaded Method to Reverse an Int or Array
        //--------------------------------------------------------
        int a[] = new int[]{2,3,4,5};
        System.out.println(reverse(234));
        a = reverse(a);
        for (int x : a)
            System.out.println(x);
    }
}
