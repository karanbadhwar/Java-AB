class Circle{
    public double radius;

    //Method For Area
    public double area()
    {
        return Math.PI * radius * radius;
    }

    //Method For Perimeter
    public double perimeter()
    {
        return 2 * Math.PI * radius;
    }

    //Method For Circumference
    public double circumference()
    {
        return perimeter();
    }
}


public class Student_Challenge_Circle_Class {
    public static void main (String[] args)
    {
        Circle c1 = new Circle();
        Circle c2 = new Circle();

        c1.radius = 7;
        c2.radius = 14;

        System.out.println("Area: "+c1.area());
        System.out.println("Perimeter: "+c1.perimeter());
        System.out.println("Circumference: "+c1.circumference());
        System.out.println("Area2: "+c2.area());
        System.out.println("Perimeter2: "+c2.perimeter());
        System.out.println("Circumference2: "+c2.circumference());
    }
}
