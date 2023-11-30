public class Pract_1D_Arrays {
    public static void main (String[] args)
    {
//        int a[] = new int[5];
//        int a[] = {};

        //Declaring arrays differently
        int A[] = new int[10];

        int B[] = {1,2,3,4,5}; // Size will be same as size of the list

        int c[];
        c = new int[10];

        int[] D = new int [5];

        //Accessing and Updating Value of an Element inside the Array
        B[2] = 15;

        //Displaying elements of an Array

            //With For Loop
//        for(int i = 0; i <A.length; i++)
//        {
//            System.out.println(A[i]); // 0 will be the output if we don't Initialize an array it will be given default value of the data type it has been signed with
//
//        }

            // With for each
        for(int x: B)
        {
            System.out.println(x++); // Won't increment value as it is not Counter Controlled Loop
        }

        for(int x: B)
        {
            System.out.println(x);
        }

        //Counter CControlled Loop
        for(int i = 0; i < B.length; i++)
        {
            System.out.println(B[i]++);
        }

        for(int x: B)
        {
            System.out.println(x);
        }

        //Printing Length of an ARray
        System.out.println(B.length);

    }
}
