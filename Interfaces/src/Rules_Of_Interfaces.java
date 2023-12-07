interface ITest
{
    //Do's

    static int A = 10;
    final int B = 10;
    public abstract  void meth1();
    void meth2();
    public static void meth3()
    {
        System.out.println("Meth3 of Interface");
    }

    private void meth()
    {
        System.out.println("Private method cannot be Abstract inside Interfaces");
    }

    default void meth5()
    {
        System.out.println("Meth5 of Interface ITest2");
        meth();
    }


    //Don't
    //    final void meth3();
    //    int cbc = 10;
    //    public final void meth4(){
    //        System.out.println("Meth4 of Interface");
    //    }

}

interface ITest2 extends ITest
{
    void meth4();

}

class My implements ITest2
{
    public void meth1() {}
    public void meth2() {}
    //meth3 is My's method not Overrided
    public void meth3() {}
    public void meth4() {}

    //Default Methods can be Override or we can use the default one's
//    public void meth5()
//    {
//        System.out.println("Meth5 of Interface ITest2");
//    }
}

public class Rules_Of_Interfaces {
    public static void main (String[] args)
    {
        System.out.println(ITest.A); // Correct
        ITest.meth3(); // Correct

        My m = new My();
        m.meth5();

//        m.meth(); // Private method of Interface cannot be accessed
    }
}
