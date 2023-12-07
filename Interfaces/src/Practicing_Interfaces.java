interface Test
{
    void meth1();
    void meth2();
}

//class My extends Test{} // Not Allowed, Interface can be Implemented not extended

class MyTest implements Test
{
   public void meth1()
   {
       System.out.println("Meth1 of MyTest Class");
   }

   public void meth2()
   {
       System.out.println("Meth2 of MyTest Class");
   }

   public void meth3()
   {
       System.out.println("Meth3 of MyTest Class");
   }
}



public class Practicing_Interfaces {
    public static void main (String[] args)
    {
        Test t;
//        t = new Test(); // Interface have all abstract methods cannot create Object

        t = new MyTest(); // Correct


    }
}
