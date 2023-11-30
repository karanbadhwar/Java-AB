public class Student_Challenge_VarArgs3 {

    //Methods - Calculate Discount using VarArgs
    //----------------------------------------
    static double discount(double ...items)
    {
        double sum = 0;
        for (int i = 0; i < items.length; i++)
        {
            sum= sum + items[i];
        }

        if (sum < 500) return (sum * 10/100);
        else if(sum > 500 && sum < 1000) return (sum * 15/100);
        else return sum*20/100;

    }

    public static void main (String[] args)
    {

        //        for(String S: args) // Can be accessed all the Command Line Arguments
        //            System.out.println(S);

        //Calculate Discount using VarArgs
        //----------------------------------------


        System.out.println(discount(10,20,03,440));



    }
}
