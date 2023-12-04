class  Rectangle_Constructor_Practice
{
    private double length;
    private double breadth;

//    public Rectangle_Constructor_Practice()
//    {
//        length=1;
//        breadth=1;
//    }
    public Rectangle_Constructor_Practice(double l, double b)
    {
        // setLength(l) To Validate Values
        // setBreadth(b) To Validate Value
        //OR
        if(l < 0)
            length = 0;
        else
            length = l;

        if(b>=0)
            breadth = b;
        else
            breadth = 0;
    }

    //For Square
    public Rectangle_Constructor_Practice( double s)
    {
        length = breadth = s;
    }
}

public class Practice_Constructors {
    public static void main (String[] args)
    {
//        Rectangle_Constructor_Practice r = new Rectangle_Constructor_Practice();

//        Rectangle_Constructor_Practice r = new Rectangle_Constructor_Practice(10,5);

//        Rectangle_Constructor_Practice r = new Rectangle_Constructor_Practice(10);
    }
}
