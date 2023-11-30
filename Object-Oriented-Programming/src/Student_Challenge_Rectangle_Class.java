class Rectangle
{
    public double length;
    public double breadth;

    public double area()
    {
        return length * breadth;
    }

    public double perimeter()
    {
        return 2*(length+breadth);
    }

    public boolean isSquare()
    {
        return length == breadth;
    }
}


public class Student_Challenge_Rectangle_Class {
    public static void main (String[] args)
    {
        Rectangle r = new Rectangle();
        r.length = 200;
        r.breadth = 200;

        System.out.println("Area: "+r.area());
        System.out.println("Perimeter: "+r.perimeter());
        System.out.println("Is it a Square: "+r.isSquare());
    }
}
