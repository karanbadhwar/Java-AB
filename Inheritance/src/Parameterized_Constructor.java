//class Parent2
//{
//    Parent2()
//    {
//        System.out.println("Non-Parameterized Constructor of Parent");
//    }
//    Parent2(int x)
//    {
//        System.out.println("Parameterized Constructor of Parent "+ x);
//    }
//}
//
//class Child2 extends Parent2
//{
//    Child2()
//    {
//        System.out.println("Non-Parameterized Constructor of Child");
//    }
//    Child2(int y)
//    {
//        System.out.println("Parameterized Constructor of Child");
//    }
//    Child2(int x, int y)
//    {
//        super(x);
//        System.out.println("Parameterized Constructor of child with 2 Parameters "+ y);
//    }
//}

class Rectangle
{
    int length;
    int breadth;

    Rectangle()
    {
        length = breadth = 1;
    }

    Rectangle(int l, int b)
    {
        length = l;
        breadth = b;
    }
}

class Cuboid extends Rectangle
{
    int height;

    Cuboid()
    {
        height = 1;
    }

    Cuboid(int h)
    {
        height = h;
    }

    Cuboid(int l, int b ,int h)
    {
        super(l,b);
        this.height = h;
    }

    int volume()
    {
        return length*breadth*height;
    }
}

public class Parameterized_Constructor {
    public static void main(String[] args)
    {
//        Child2 c = new Child2(22,10);

        //Non-Para Constructor
        Cuboid c = new Cuboid();

        //Para Constructor
        Cuboid c1 = new Cuboid(10);

        //Para with Super Constructor
        Cuboid c2 = new Cuboid(10,20,30);

        System.out.println(c.volume());
        System.out.println(c1.volume());
        System.out.println(c2.volume());

    }

}
