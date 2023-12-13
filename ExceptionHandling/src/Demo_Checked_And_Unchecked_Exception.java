class CustomLowBalanceException extends Exception
{
    @Override
    public String toString()
    {
        return "Balance Should not be less than 5000";
    }
}
public class Demo_Checked_And_Unchecked_Exception {

    static void fun1()
    {
        try {
            throw new CustomLowBalanceException(); // As it was Extended from Exception Class, it becomes Checked and should be Handled
        }
        catch (CustomLowBalanceException e)
        {
            System.out.println(e);
        }
        }
    static void fun2()
    {
        fun1();
    }
    static void fun3()
    {
        fun2();
    }

    public static void main(String[] args) {
        fun3();
    }
}

//Check Exception which should be Handled Before even trying to Compile
//FileInputStream f1 = new FileInputStream("My.txt");
//-----------------------------------------------------------------------------------


//UnChecked RunTime Error, Not forced by the Compiler to get it Fixed
//static void fun1()
//{
//    try
//    {
//        System.out.println(10/0);
//    }
//    catch(Exception e)
//    {
////            e. // To get all the members present inside e Obj Ref of Exception Class or from Parent Class
////            System.out.println(e.getMessage());
////            System.out.println(e);
////            e.printStackTrace();
//    }
//
//}
//static void fun2()
//{
//    fun1();
//}
//static void fun3()
//{
//    fun2();
//}
//
//public static void main(String[] args) {
//    fun3();
//}