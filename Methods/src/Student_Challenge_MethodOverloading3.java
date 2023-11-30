public class Student_Challenge_MethodOverloading3 {

    // Methods - Overloaded method to validate name and age
    //-------------------------------------------------------

    static boolean validate (String name)
    {
        return name.matches("[a-zA-Z\\s]+");
    }

    static boolean validate (int age)
    {
        return age >= 3 && age <= 10;
    }




    public static void main (String[] args)
    {

        //Overloaded method to validate name and age
        //-------------------------------------------------------

        System.out.println(validate("Karan Badhwa455"));
        System.out.println(validate(3));


    }
}
