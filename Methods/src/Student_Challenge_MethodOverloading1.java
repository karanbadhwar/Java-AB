public class Student_Challenge_MethodOverloading1 {

    //Overloaded Method to Calculate Areas
    //--------------------------------------------------

    static double area (double l, double b)
    {
        return l * b;
    }

    static double area (float radius)
    {
        return Math.PI * radius * radius;
    }

    public static void main (String[] args)
    {

        //Overloaded Method to Calculate Areas
        //--------------------------------------------------
            // For Rectangle
            System.out.println(area(200.50f, 100.0f));
            //For Circle
            System.out.println(area(300));
    }
}
