public class Demo_Finally {

    static void meth1() throws Exception
    {
        try
        {
            throw new Exception();
        }
        finally
        {
            System.out.println("Final Message");
        }


    }

    public static void main(String[] args) throws Exception
    {
        meth1();
    }
}


//        System.out.println(10/0);// This steps, where Program Crashes
//        System.out.println("Final Message"); // This will not Run

//---------------------------------------------------------------------------------


//    public static void main(String[] args) throws Exception
//    {
//
//        //Finally block is needed mostly if we are not handling Exception, or we have multiple Catch Blocks
//        try
//        {
//            System.out.println(10/0);
//        }
//        catch(ArithmeticException e)
//        {
//            System.out.println(e);
//        }
//        finally //Finally Block will Run No matter what the Try block holds
//        {
//            System.out.println("Final Message");
//        }
//    }