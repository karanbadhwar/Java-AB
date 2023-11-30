public class Student_Challenge_SecondLargest_Element {
    public static void main (String[] args)
    {
        int A[] = {3,9,7,8,12,6,15,5,4,10,22,18};

        //Finding sum of all Elements
        //----------------------------------

//        int sum = 0;
//
//        for(int i = 0; i < A.length; i++)
//        {
//            sum = sum + A[i];
//        }
//
//        System.out.format("Sum of all the elements is: %d", sum);


        //Searching an Element from an Array
        //----------------------------------

            //Linear Search

//        int searchEl = 6;
//
//        for (int i = 1; i < A.length; i++)
//        {
//            if(A[i] == searchEl)
//            {
//                System.out.println("Element Found at Index: "+i);
//                System.exit(0);
//            }
//
//        }
//        System.out.println("No Element Found");


        //Finding Maximum(Largest) Element from an Array
        //----------------------------------

//        int max = A[0];
//        for(int i = 0; i <A.length; i++)
//        {
//            if(max < A[i]){
//                max = A[i];
//            }
//        }
//        System.out.println(max);



        //Finding Second-Largest Element from an Array
        //----------------------------------
        int max1= A[0];
        int max2 = A[0];
        for (int i = 0; i < A.length; i++)
        {
            if(A[i] > max1)
            {
                max2 = max1;
                max1 = A[i];
            } else if(A[i] > max2)
                max2 = A[i];


        }
        System.out.format("Maximum Value is: %1$d and Second Largest Value is: %2$d", max1,max2);






    }
}
