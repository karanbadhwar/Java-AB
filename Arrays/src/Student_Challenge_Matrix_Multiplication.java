import java.util.Scanner;
public class Student_Challenge_Matrix_Multiplication {
    public static void main (String[] args)
    {
        int A[][] = {{3,5,9}, {7,6,2}, {4,3,5}};

        int B[][];
        B = new int[3][3];

        B[0] = new int[]{1,5,2};
        B[1] = new int[]{6,8,4};
        B[2] = new int[]{3,9,7};

        int C[][] = new int[3][3];

        Scanner scan = new Scanner(System.in);

        //Adding 2 Matrices
        //--------------------------------
        // Adding and Subtraction can only be done if both the Matrices are of same size Ex- A = 3x3 B = 3x3

//        for(int i = 0; i < A.length; i++)
//        {
//            for(int j = 0; j < A[i].length; j++)
//            {
//                C[i][j] = A[i][j] + B[i][j];
//                System.out.format("%02d ", C[i][j]);
//            }
//            System.out.println();
//        }




        //Multiplying 2 Matrices
        //--------------------------------


//        System.out.println("PLease Enter the Following Values to Multiply Two Mtrices");
//        System.out.println("Specifiy the Rows For First Matrix");
//        int row1 = scan.nextInt();
//        System.out.println("Specifiy the Columns For First Matrix");
//        int col1 = scan.nextInt();
//        System.out.println("Specifiy the Rows For Second Matrix");
//        int row2= scan.nextInt();
//        System.out.println("Specifiy the Columns For Second Matrix");
//        int col2= scan.nextInt();
//
//
//        if(col1 != row2)
//        {
//            System.out.println("Multiplication is Not Possible");
//        }
//        else {
//
//            int matrix1[][] = new int[row1][col1];
//            int matrix2 [][] = new int[row2][col2];
//            int mulMatrix[][] = new int[row1][col2];
//
//            System.out.println("Please start providing Value for Matrix 1");
//
//            for (int i = 0; i < row1; i++)
//            {
//                for (int j =0; j < col1; j++)
//                {
//                    System.out.format("Provide the Value for %d Row and %d Column \n", i+1, j+1);
//                    matrix1[i][j] = scan.nextInt();
//                }
//            }
//
//            System.out.println("Please Provide the Values for Matrix 2");
//
//            for(int i = 0; i < row2; i++)
//            {
//                for (int j = 0; j < col2; j++)
//                {
//                    System.out.format("Provide the Value for %d Row and %d Column \n", i+1, j+1);
//                    matrix2[i][j] = scan.nextInt();
//                }
//            }
//
//            System.out.println("Now the values of the Multiplication Matrix are Following");
//
//
//            for(int i = 0; i < row1; i++)
//            {
//                for (int j=0; j <col2; j++)
//                {
//                    mulMatrix[i][j] = 0;
//                    for (int k = 0; k < col1; k++)
//                    {
//                        mulMatrix[i][j] = mulMatrix[i][j] + matrix1[i][k] * matrix2[k][j];
//                    }
//                }
//            }
//
//            for (int x[]: mulMatrix)
//            {
//                for (int y: x) {
//
//
//                    System.out.format("%d ", y);
//                }
//                System.out.println();
//            }
//
//        }



        //Sorting An Array of Strings
        //-----------------------------------

        String arr[] = {"java", "python", "javaScript", "rust", "ada", "pascal"}; //As String Literals are Objects of Class String, so it is an Array of Objects

        java.util.Arrays.sort(arr);

        for (String x: arr)
            System.out.println(x);














    }
}
