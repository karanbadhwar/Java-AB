public class Student_Challenge_Rotation_of_Array {
    public static void main (String[] args)
    {
//        int A[] = {1,2,3,4,5,6,7,8,9,0};

//        //Rotating An Array (Left Rotation)
//        //--------------------
//        int temp = A[0];
//        for (int i = 0; i <A.length -1; i++)
//        {
//            A[i] = A[i+1];
//        }
//            A[A.length -1] = temp;
//
//        for(int x:A)
//            System.out.println(x);


        //Rotating An Array (Right Rotation)
        //--------------------
//        int temp = A[A.length - 1];
//        for (int i = A.length - 1; i >0; i--)
//        {
//            A[i] = A[i - 1];
//        }
//        A[0] = temp;
//
//        for(int x:A)
//            System.out.println(x);




        //Inserting a new Element in An Array at Given Index
        // --------------------
//        int A[] = new int[10];
//        int index = 2;
//        int newVal = 99;
//
//        A[0] = 5;
//        A[1] = 9;
//        A[2] = 6;
//        A[3] = 10;
//        A[4] = 12;
//        A[5] = 7;
//
//
//        for(int i = A.length -1; i >= 0; i-- )
//        {
//            if(i == index) {
//                A[i+1] = A[i];
//                A[i] = newVal;
//            } else if( i < A.length -1 && i > index)
//                A[i+1] = A[i];
//        }
//
//
//        for(int x:A)
//            System.out.println(x);



        //Deleting a new Element in An Array at Given Index
        // --------------------
        int A[] = new int[10];
        int index = 2;

        A[0] = 5;
        A[1] = 9;
        A[2] = 6;
        A[3] = 10;
        A[4] = 12;
        A[5] = 7;


        for(int i = index; i <A.length -1; i++)
        {
            if(i == index)
                A[i] = A[i+1];
            else
                A[i] = A[i+1];
        }

        for(int x:A)
            System.out.println(x);







    }
}
