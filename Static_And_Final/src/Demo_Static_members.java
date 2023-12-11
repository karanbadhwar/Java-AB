class Test
{
    static int x = 10;
    int y = 20;

    void show()
    {
        System.out.println(x); // Allowed
        System.out.println(y); // Allowed
        System.out.println("");
    }

    static void display()
    {
        System.out.println(x); // Allowed
//        System.out.println(y); // Not Allowed as Y is non-static
    }
}

public class Demo_Static_members {
    public static void main(String ...args)
    {
        Test t1 = new Test();
        t1.show();

        t1.x = 30; // Changing value of Static Member will affect the value for all Instances

        t1.y = 40; // Y is non-static, it will change the value for specific Instance

        Test t2 = new Test();
        t2.show();

//        t2.display(); //Allowed but not recommended
    }
}
