import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

class My
{
    private int a;
    protected int b;
    public int c;
    int d;

    public My(){}

    public My(int x, int y){}

    public void display(String s1, String s2){}

    public int show(int x, int y) { return 0;}

}

public class Reflection_Package {
    public static void main(String[] args) {

        //Getting Metadata of a Class
        Class c = My.class;
//        System.out.println(c.getName());

        My m = new My();
        Class c1 = m.getClass();

        //----------------------------------------------

        //Fields of a class
        Field field[] = c.getDeclaredFields();

        for(Field f: field)
        {
//            System.out.println(f);
//            System.out.println(f.getName());
        }

        //----------------------------------------------

        //Getting Constructor info of a class
        Constructor[] con = c.getConstructors();

//        for(Constructor x: con)
//            System.out.println(x);

        //----------------------------------------------

        //Getting Methods of a class
        Method[] meth = c.getMethods();

        for (Method m1: meth)
        {
//            System.out.println(m1);
        }

        //----------------------------------------------

        //Getting Parameters of a Method
        Parameter[] param = meth[0].getParameters();
        Parameter[] param1 = meth[1].getParameters();

        for(Parameter p: param1)
        {
            System.out.println(p);
        }
        for(Parameter p: param)
        {
            System.out.println(p);
        }


//        System.out.println(c);
//        System.out.println(c1);

    }
}
