class Super_overriding
{
    protected void display()
    {
        System.out.println("Super Display");
    }
}

class Sub_overriding extends Super_overriding
{
    @Override
    public void display()
    {
        System.out.println("Sub Display");
    }
}

public class PolyMorphism_Using_Overriding {
    public static void main (String[] args)
    {
        Super_overriding s = new Super_overriding();
//        s.display();

        Sub_overriding s1 = new Sub_overriding();
//        s.display();

        //Dynamic Method Dispatch
        Super_overriding s2 = new Sub_overriding();
        s2.display();
    }
}
