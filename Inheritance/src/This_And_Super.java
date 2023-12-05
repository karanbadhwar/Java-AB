class Rectangle_with_this
{
    int length;
    int breadth;

    Rectangle_with_this(int length, int b)
    {
        this.length = length;
        //length = length; // It is Wrong Compiler thinks we are pointing to length Parameter no the class Property
        breadth = b; // It is Fine as there are no name conflicts
//        this.breadth = b; // It is Fine too
    }
    void display()
    {
        System.out.println("Length: "+this.length);
        System.out.println("Breadth: "+this.breadth);
    }
}


public class This_And_Super {
    public static void main (String[] args)
    {
        Rectangle_with_this r = new Rectangle_with_this(10,20);
        r.display();
    }
}
