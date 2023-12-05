class Super_DMD
{
    public void meth1() { System.out.println("Super Meth1");}
    public void meth2() { System.out.println("Super Meth2");}
}

class Sub_DMD extends Super_DMD
{
    @Override
    public void meth2() { System.out.println("Sub Meth2");}
    public void meth3() { System.out.println("Sub Meth2");}
}

public class Dynamic_Method_Dispatch {
    public static void main (String[] args)
    {

//        Super_DMD sup = new Super_DMD();
//        sup.meth1();
//        sup.meth2();

//        Sub_DMD sub = new Sub_DMD();
//        sub.meth1();
//        sub.meth2();
//        sub.meth3();

        Super_DMD s = new Sub_DMD(); // Allowed
//        Sub_DMD s1 = new Super_DMD(); // Not Allowed
        s.meth1();
        s.meth2();








    }
}
