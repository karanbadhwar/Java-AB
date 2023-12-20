@FunctionalInterface
interface MyLambda
{
    public void display();
}



/*
class My implements MyLambda
{
    public void display()
    {
        System.out.println("Hello World");
    }
}
*/


public class Demo_Lambda {
    public static void main(String[] args) {
        MyLambda m = () -> { System.out.println("Hello World"); };

        m.display();


    }
}
