public class Student_Challenge_VarArgs2 {

    //Methods - Sum of all elements using VarArgs
    //-----------------------------------------

    static double sum(double...A)
    {
        double sum = 0;
        for (int i = 0; i < A.length; i++)
        {
            sum = sum + A[i];
        }
        return sum;
    }

    public static void main (String[] args)
    {

        //Sum of all elements using VarArgs
        //-----------------------------------------
        System.out.println(sum(12,2,34,34,343,2.5d));

    }
}
