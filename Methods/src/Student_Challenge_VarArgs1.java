public class Student_Challenge_VarArgs1 {

    //Methods-Maximum of Numbers using VarArgs
    //---------------------------------------
    static float max(float ...A)
    {
        if(A.length == 0) return Float.MIN_VALUE;

        float max = A[0];
        if (A.length == 1) return max;

        for (int i = 0; i < A.length; i++)
        {
            if(A[i] > max)
                max = A[i];
        }
        return max;


    }


    public static void main (String[] args)
    {

        //Maximum of Numbers using VarArgs
        //---------------------------------------
        System.out.println(max());
        System.out.println(max(10));
        System.out.println(max(10,22,44,55.5f,66,22));
        System.out.println(max(10,22,44,55.5f,66,22, 76.5f));
    }
}
