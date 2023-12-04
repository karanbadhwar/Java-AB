class Cylinder
{
    public double radius;
    public float height;

    //Methods
    public double lidArea()
    {
        return Math.PI * radius * radius;
    }

    public double totalSurface()
    {
        return (2*lidArea()) + (circumference() * height);
    }

    public double circumference()
    {
        return 2*Math.PI * radius;
    }

    public double volume()
    {
        return lidArea() * height;
    }
}




public class Student_Challenge_Cylinder_Class {
    public static void main (String ...args)
    {
        Cylinder c = new Cylinder();

        c.radius = 7;
        c.height =10;
        System.out.printf("Lid Area: %.2f \n",c.lidArea());
        System.out.printf("Circumference: %.2f \n",c.circumference());
        System.out.printf("Total Surface: %.2f \n",c.totalSurface());
        System.out.printf("Volume: %.2f \n",c.volume());
    }
}
