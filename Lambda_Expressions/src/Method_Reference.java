@FunctionalInterface
interface MyLambda1
{
    public int display(String s, String str);
}


public class Method_Reference {

    //Constructor
    public Method_Reference(String s)
    {
        System.out.println(s.toUpperCase());
    }

    //static method in main class
    public static void reverse(String str)
    {
        StringBuffer sb = new StringBuffer(str);
        sb.reverse();
        System.out.println(sb);
    }

    //Non-static method
    public void reverse_2(String str)
    {
        StringBuffer sb = new StringBuffer(str);
        sb.reverse();
        System.out.println(sb);
    }

    public static void main(String[] args) {
//        MyLambda1 ml = System.out::println;

        MyLambda1 ml4 = String::compareTo;
        System.out.println(ml4.display("hello", "hello"));

        
    }
}


//Static Methods
//        MyLambda1 ml =  Method_Reference::reverse;
//        ml.display("karan");

// Non-static methods
//        Method_Reference mr= new Method_Reference();
//        MyLambda1 ml2 = mr::reverse_2;

//        ml2.display("narak");


//Constructors // It creates an Instacnce of Method_Reference but it is not stored in any variable
//        MyLambda1 ml3 = Method_Reference::new;
//
//        ml3.display("kkkkkBbb"); // this calls the constrcutor of Method_Reference class
