//Anonymous Inner Class
abstract class My{
    abstract public void show ();
}

class Outer3
{
    int x = 20;
    public void display()
    {
        //Anonymous Object Creation of class My(Abstract Class)
//        My m = new My(); // Cannot instantiate an Object of Abstract class

        My m = new My() // Did not end the class here with Semi-Colon instead Created an object and Overrided Method. Made it Anonymous Class and an Object at the same time
        {
            @Override
            public void show()
            {
                System.out.println("Hello from Anonoymous Class");
//                System.out.println(x);
            }
        }; // ending the Class
        m.show();
    }
}

//Anonymous Inner Class with Interface is same as doing with Abstract Class


// Local inner Class
class Outer2
{
    public void display()
    {
        // Local CLass
        class Inner
        {
            public void show()
            {
                System.out.println("Inner Hello");
            }
        }
//        Inner i = new Inner();
//        i.show();

        new Inner().show(); // Anonymous Object which will have no value after this line
    }
}

public class Demo_Local_Anonymous_InnerClass {
    public static void main (String[] args)
    {
        Outer2 o = new Outer2();
//        o.display();

        Outer2 oi = new Outer2(){
                public void abc() { System.out.println("abc");}
        };
//        oi.display();
//        oi.abc(); // Not Working because oi is Ref of Outer2 and the class created was Anonymous that's why, which does not have any existence

        Outer3 o1 = new Outer3();
        o1.display();
    }
}
