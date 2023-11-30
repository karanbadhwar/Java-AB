public class Two_Dimensional_Array_2D {
    public static void main (String[] args)
    {
        //Ways to define them
        //-------------------------------------
        int A[][] = new int[5][5];

        int B[][] = {{1,2,3}, {4,5,6}, {1,2,3}}; // it will be [3][3]

        int c[][];
        c = new int[5][5];

        // Jagged Array
        //-------------------------------------
        int [][]D;
        D = new int[3][];
        D[0] = new int[4];
        D[1] = new int[2];
        D[2] = new int[1];

        int []E[] = new int[5][5];

        int[] F, G[]; // int[] F; int[] G[]; It is like this Indeed

        F = new int [3]; // F is Single Dimensional Array
        G = new int[3][4]; // But G is 2D Array

        int[] J,K,L,M[];  //These all are Single Dimensional Arrays other than M


        // Two-Dimensional Array 2D Array
        //-------------------------------------

            // For-Loop
           //-------------------------------------
//            for (int i = 0; i < B.length; i++)
//            {
//                for (int j = 0; j < B[i].length; j++)
//                {
//                    System.out.format("%d ",B[i][j]);
//                }
//                System.out.println("");
//            }

            //For-Each-Loop
           //-------------------------------------
//            for(int x[]: B)
//            {
//                for (int y: x)
//                {
//                    System.out.format("%d ", y);
//                }
//                System.out.println();
//            }



        // Two-Dimensional Array 2D Array With String
        //-------------------------------------

        String str[][];

        str = new String[3][3];

        String str1[] = new String[3];

        String str2[]= {"Karan", "Karna", "badhwar"};

        String str3[][] = {{"k", "s", "d"}, {"b"}, {"c"}}; //2D Jagged String Array

//        for(String string[]: str3)
//        {
//            for(String s: string)
//            {
//                System.out.format("%s ", s);
//            }
//            System.out.println();
//        }



    }
}
