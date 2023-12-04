class RectangleClass
{
    private double length;
    private double breadth;

    //Getter MEthods
    double getLength()
    {
        return length;
    }

    double getBreadth()
    {
        return breadth;
    }

    //Setter Methods
    public void setLength(double l)
    {
        if(l > 0)
            length = l;
        else
            length = 0;
    }
    public void setBreadth(double b)
    {
        if(b > 0)
            breadth = b;
        else
            breadth = 0;
    }


    //Other Methods
    public double area()
    {
        return getBreadth() * getLength();
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

public class Prac_Data_Hiding {
    public static void main (String[] args)
    {
        RectangleClass r = new RectangleClass();
//        r.length = 10; //Cannot be accessed Directly
//        r.breadth = 20; //Cannot be accessed Directly

        System.out.println("Area: "+r.area()); //Before Setting L and B

        r.setLength(10.5);
        r.setBreadth(5.5);

        System.out.println("Area: "+r.area());
        System.out.println("Perimeter: "+r.perimeter());
        System.out.println("Is it a Square: "+r.isSquare());

        System.out.println("Length: "+ r.getLength());
        System.out.println("Breadth: "+ r.getBreadth());

    }
}
