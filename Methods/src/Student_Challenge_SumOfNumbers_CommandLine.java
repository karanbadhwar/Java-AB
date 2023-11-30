public class Student_Challenge_SumOfNumbers_CommandLine {
    public static void main(String ...args)
    {
        double sum = 0;



        for(String s: args) {
            if(s.matches("[0-9\\.]+"))
                sum = sum + Double.parseDouble(s);
        }

        System.out.println(sum);
    }
}
