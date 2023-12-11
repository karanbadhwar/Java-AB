class Test_SB
{
    static
    {
        System.out.println("Block 1");
    }

    static
    {
        System.out.println("Block 2");
    }
}


// This Class gets loaded no matter what so we don't have to wait until we create an Object
public class Demo_Static_Blocks {

//    static
//    {
//        System.out.println("Block 1"); // Once we run the program, the class gets loaded these Static Methods Run immediately
//    }
//
//    public static void main  (String[] args)
//    {
//        System.out.println("Main"); // It will run last after all Static members gets Executed
//    }
//
//    static {
//        System.out.println("Block 2");
//    }

    public static void main (String[] args)
    {
        Test_SB t = new Test_SB(); // When we create an Object the class will get loaded so Static Blocks will run
        System.out.println("Main");
    }
}
