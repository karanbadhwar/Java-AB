class Rectangle_with_super
{
    int length;
    int breadth;
    int x = 10;

    Rectangle_with_super(int length, int breadth)
    {
        this.length = length;
        this.breadth = breadth;
    }
}

class Cuboid_with_super extends Rectangle_with_super
{
    int height;
    int x =20;
    Cuboid_with_super(int l, int b, int h) {
        super(l, b);
        this.height = h;
    }

    void display()
    {
        System.out.println(super.x); //  X present in rectangle Class
        System.out.println(x);
        this.volume();
    }
    static void volume()
    {
        System.out.println("Volume");
    }

}


public class This_And_Super_2 {
    public static void main(String ...args)
    {
        Cuboid_with_super c = new Cuboid_with_super(10,20,30);

        c.display();
        

    }
}
