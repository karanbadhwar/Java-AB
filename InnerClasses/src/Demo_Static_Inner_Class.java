class Outer_Static
{
    int x = 10;
    static int y = 20;

    static class My_Static
    {
        public void show()
        {
//            System.out.println(x); // Cannot Access Non-Static Members of a Class
            System.out.println(y);
        }
    }

}

public class Demo_Static_Inner_Class {
    public static void main (String ...args)
    {
        //Static Inner Class's Object can be created without creating an object of Outer Class
        Outer_Static.My_Static m = new Outer_Static.My_Static();
        m.show();
    }

}

//class A
//{
//    Outer_Static.My_Static o = new Outer_Static().new My_Static(); // Cannot Access as the class is Static, it's Object can only be created Inside a static class or Object
//}