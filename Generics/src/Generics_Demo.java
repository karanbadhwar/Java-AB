public class Generics_Demo <T>
{
    T data[] = (T[]) new Object[3];

    public static void main(String[] args) {
        Generics_Demo<String> gd = new Generics_Demo();

        gd.data[0] = "Hi";

        gd.data[1] = "Bye";

//        gd.data[2] = 10;

        String str = gd.data[0];
    }

}


//Generalization Methods before version 1.5 using Object Class
//--------------------------------------------------------------------
//********************************************************************
// public static void main(String[] args) {
//        Object obj = new String("Hi");
////        obj = new Integer(10);
//
//        String str = (String)obj;
//
//        System.out.println(str);

        //Array of Objects

//        Object[] objNew = new Object[3];
//
//        objNew[0] = "Hi";
//        objNew[1] = "Bye";
//        objNew[2] = new Integer(10); // There is No TypeSafety at Compile Time
//        objNew[2] = 10;
        /*
        In Java, this code will compile without any error because of autoboxing.
        Autoboxing is the automatic conversion that the Java compiler makes between the primitive types and their corresponding object wrapper classes.
        When you assign an int value to an element in an Object array, as in your case (objNew[2] = 10;), Java will automatically box the int value 10 into an Integer object before placing it into the array.
        So, although objNew is an array of Object type and 10 is an int primitive type, Java will perform the conversion implicitly by wrapping the int value in an Integer object behind the scenes.
        This behavior is allowed in Java due to autoboxing.
//         */
//String str;
//
//        for(int i = 0; i < 3; i++)
//        {
//str  = (String) objNew[i]; // There is No TypeSafety at Compile Time, but only at Runtime error
//        System.out.println(str);
//        }
//                }
