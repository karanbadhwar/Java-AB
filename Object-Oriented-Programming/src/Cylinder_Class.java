class Cylinder_With_Constructor
{
    private double radius;
    private double height;

    //Getters
    public double getRadius()
    {
        return radius;
    }

    public double getHeight()
    {
        return height;
    }

    //Setters
    public void setRadius(double r)
    {
        if ( r > 0)
            radius = 0;
        else
            radius = r;
    }

    public void setHeight(double h)
    {
        if ( h > 0)
            radius = 0;
        else
            height = h;
    }

    public void setDimensions(double r, double h)
    {
        setRadius(r);
        setHeight(h);
    }

    public Cylinder_With_Constructor()
    {
        radius = 0;
        height = 0;
    }
    public Cylinder_With_Constructor(double r)
    {
        setRadius(r);
        height = 1;
    }

    public Cylinder_With_Constructor(double r, double h)
    {
        setRadius(r);
        setHeight(h);
    }
}


public class Cylinder_Class {
    public static void main (String[] args)
    {

    }
}
