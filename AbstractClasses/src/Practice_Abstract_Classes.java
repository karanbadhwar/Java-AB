abstract class Super
{
    public Super() {
        System.out.println("Super Constructor");
    }

    public void meth1()
    {
        System.out.println("Meth1 of Super");
    }
    abstract public void meth2();
}

class Sub extends Super
{
    @Override
    public void meth2()
    {
        System.out.println("Meth2 of Sub");
    }
}

class A
{
    void display()
    {
        System.out.println("Super class Display");
    }
}
abstract class B extends A{
    abstract void display();
}

class C extends B{
    void display(){ System.out.println("Grand Class");}
}


public class Practice_Abstract_Classes {
    public static void main (String[] args)
    {
//        Super s = new Super(); // Abstract classes cannot be Instantiated!!
//        s.meth1();
        Super s; // Reference can be created but not Instantiated

        Super s1 = new Sub();
//        s1.meth1();
//        s1.meth2();

        C c1 = new C();
        B b1 = new C();
//        B b2 = new B(); // Not Allowed

        b1.display();
        c1.display();
    }
}
