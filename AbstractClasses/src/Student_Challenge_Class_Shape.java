abstract class Shape
{

    //Methods for Shape
    abstract double perimeter();
    abstract double area();
}

class Circle extends Shape
{
    public double radius;
    @Override
    public double perimeter()
    {
        return 2*Math.PI * radius;
    }

    @Override
    public double area()
    {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape
{
    public double length;
    public double breadth;

    @Override
    public double perimeter()
    {
        return 2*(length + breadth);
    }

    @Override
    public double area()
    {
        return length * breadth;
    }
}

public class Student_Challenge_Class_Shape {
    public static void main (String[] args)
    {
        Shape s = new Circle();
//        s.radius = 20; // not possible
        System.out.println("Shape ref and Circle Object: "+s.area());// Cannot access radius though

        Circle c = new Circle();
        c.radius = 20;

        Shape s1 = c;

//        System.out.println(s1.radius); //Cannot access


        System.out.println("Circle Object and Ref: "+c.area());

        System.out.println("Shape Ref and Circle Object: "+s1.area());
    }
}
