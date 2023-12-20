import java.lang.*;

class MyObject
{
    public String toString()
    {
        return "My Object";
    }

    public int hashCode()
    {
        return 100; // It should not be overrided, as then it is our responsibility to give every Object Unique Code
    }

    @Override // Override Equals Methods, as now it compares Objects on HashCode not on Address
    public boolean equals(Object o)
    {
        return this.hashCode() == o.hashCode();
    }

//    public void wait() // Cannot Override this method as these methods are final
//    {
//
//    }
}

public class Object_Class {
    public static void main(String[] args)
    {
        MyObject o1 = new MyObject();
        MyObject o2 = new MyObject();
        System.out.println(o1);

        System.out.println(o1.hashCode()); // 100 if we Override the method, otherwise Java Created Hash Code
        System.out.println(o2.hashCode()); // 100 if we Override the method, otherwise Java Created Hash Code

        System.out.println(o1.equals(o2));

    }
}


//Few Methods
//---------------------------------------------

//        Object o1 = new Object();
//        Object o2 = new Object();
//        Object o3 = o1;
//        System.out.println(o1.equals(o2));// False as o2 is holding Different Object Ref
//        System.out.println(o1.equals(o3));// True as o3 is holding Same Object Ref
//
//        System.out.println(o1.hashCode()); //Every Object has a Unique Hash Code by using Internal Address of the Object



//Empty Class Inheriting From Object Class
//---------------------------------------------------

//class MyObject
//{
//    // Even If this Class Remains Empty it will have all the Methods from its Parent Class
//}
//
//class MyObject2 extends MyObject
//{
//
//}

//MyObject o1  = new MyObject();
//        MyObject2 o2 = new MyObject2();