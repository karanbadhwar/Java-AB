

public class Demo_Final_Keyword {


    public static void main(String[] args)
    {

    }
}

    //FINAL VARIABLE
//---------------------------------

//1    final float PI = 3.1425f; //Allowed but needs to be Initialized if Declaring outside the Methods

//2    final float PI; // Not Allowed as it was Outside Methods and not being Initialized

//3    static final float S_PI;
//    static
//    {
//        S_PI = 3.1425f;
//    }

//4    final float PI2;
//    Demo_Final_Keyword()
//    {
//        PI2 =200f;
//    }

//5        final int x = 10; // Allowed

//6       final float PI = 3.1425f; // Allowed

//7       System.out.println(PI2); //Not Allowed as PI was Declared outside the main method and it can only access Static Members Either Create PI2 Static or don't use it


//FINAL METHOD
//---------------------------------

//class Test_final
//{
//    public final void show()
//    {
//        System.out.println("Hello");
//    }
//}
//
//class Sub_Test extends Test_final
//{
//
////    Cannot Override Final Method, Restricting Polymorphism
////    public final void show()
////    {
////        System.out.println("Hi");
////    }
//}

//FINAL CLASS
//---------------------------------

//final class Test_F
//{
//
//}
//
//class Sub_Test extends Test_F // Cannot Extend Final CLass
//{}