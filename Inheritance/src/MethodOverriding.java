class Super
{
    public void display()
    {
        System.out.println("Super Class Display");
    }

}

class Sub extends Super
{
    @Override
    public void display()
    {
        System.out.println("Sub Class Display");
    }

}

public class MethodOverriding {
    public static void main (String ...args)
    {
//        Super su = new Super();
//        su.display();
//
//        Sub s = new Sub();
//        s.display();

        // Dynamic Method Dispatch
        Super s1 = new Sub();
        s1.display();
    }

}
