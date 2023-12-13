public class Demo_Nested_TryCatch {
    public static void main(String[] args) {
        int A[] = {30,20,10,40,0};

        try {
            int c = A[0] / A[1]; // If Exception is here, rest of the statements will not be executed
            System.out.println("Division is: " + c);

            //Nest Try...Catch
            try
            {
                System.out.println(A[5]); // It will give an Error as ArrayIndexOutOfBoundException
            }
            catch(ArrayIndexOutOfBoundsException e)
            {
                System.out.println("Index is Invalid");
            }

        }
        catch(ArithmeticException e)
        {
            System.out.println("Denominator should not be 0, try again");
        }


        System.out.println("End of Program");
    }
}
