@FunctionalInterface
interface MyLambda_Param
{
    public int add(int x, int y);
}


public class Demo_Lambda_Parameters {
    public static void main(String[] args) {
        MyLambda_Param m = (a,b) ->  a+b;

        System.out.println(m.add(20,30));

    }
}
