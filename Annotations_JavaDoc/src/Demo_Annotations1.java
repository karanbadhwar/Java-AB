//@FunctionalInterface

@FunctionalInterface // Decalring and announcing to make sure compiler know it is a functional Interface
interface My
{
    public void show();
}

public class Demo_Annotations1 {
    public static void main(String[] args) {

    }
}



//@Override
    //abstract class Parent
    //{
    //    public void display(){}
    //}
    //
    //class Child extends Parent
    //{
    //    @Override // This annotation effects on the code, as if we change the name of the Method compiler will giver alert
    //    public void display(){}
    //}



//@Deprecated
//class OldClass
//{
//    public void display()
//    {
//        System.out.println("Hello");
//    }
//
//    @Deprecated // This gives new Programmers alert that this method should be not be used, as it is old or deprecated
//    public void show()
//    {
//        System.out.println("Hi");
//    }
//}
//

//public class Demo_Annotations1 {
//    public static void main(String[] args) {
//        OldClass o = new OldClass();
//
////        o.show(); // It shows in the suggestion that this method is Striked off, if we try to compile it, compiler will give warning
//    }
//}




//@SuppressWarnings
//import java.util.*;
//class OldClass
//{
//    public void display()
//    {
//        System.out.println("Hello");
//    }
//
//    @Deprecated
//    public void show()
//    {
//        System.out.println("Hi");
//    }
//}
//
//public class Demo_Annotations1 {
//
//    static List<Integer> l = new ArrayList<>();
//    //    @SuppressWarnings("deprecation") // It tells compiler that do not show me warning and still use Deprecated Methods
////    @SuppressWarnings("unchecked")
//    public static void main(String[] args) {
//
//        l.add(10);
//
//
////        OldClass o = new OldClass();
////        o.show();
//
//    }
//}



//@SafeVarargs
//class My<T>
//{
//    @SafeVarargs // Method should be Final or Private, as it is to ignore warning regarding not safe DataType varargs
//    private void show(T...args)
//    {
//        for(T x: args)
//            System.out.println(x);
//    }
//}
//public class Demo_Annotations1 {
//    public static void main(String[] args) {
//
//    }
//}