@FunctionalInterface
interface MyLambdaExp
{
    public void display();
}

class Demo
{
    int temp = 10; // Lambda Expression can capture Instance variable, they may or may not be Final no issue to that
    public void method1()
    {
        int count = 0; // I can use this variable inside the Lambda Expression, only if it is not modified
        MyLambdaExp ml = () ->
        {
            int x = 10;
            System.out.println("Hi"+temp);
            System.out.println("Bye"+count);
            x++;
        };
        ml.display();
//        count++; , it cannot be Modified
        temp++;

    }
}

class useLambda
{
    public void callLambda(MyLambdaExp ml)
    {
        ml.display();
    }
}

class callLambda
{
    public void method()
    {
        useLambda ul = new useLambda();
        ul.callLambda(() -> {
            System.out.println("Calling Lambda and Sending Lambda Parameter");
        });
    }
}

public class Capture_Lambda_Expression {
    public static void main(String[] args) {
//        Demo d = new Demo();
//        d.method1();

        callLambda cl = new callLambda();
        cl.method();
    }
}
