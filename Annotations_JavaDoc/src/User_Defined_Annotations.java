import java.lang.annotation.Annotation;

@interface MyAnno
{
    //Elements of Annotation
    String name();
    String project();
    String date();
//    float version();
    String version() default "13";
}


class My_Anno
{

}
@MyAnno(name="karan", project="bank", date="1/1/1111") //- Class Level
public class User_Defined_Annotations
{

    My_Anno MA;


    public static void main( String[] args) //- Parameter Level
    {

        int x;
    }
}



//Level of Annotation
//@MyAnno(name="karan") //- Class Level
//public class User_Defined_Annotations
//{
//    @MyAnno(name="karan")//- Instance Level
//    My_Anno MA;
//
//    @MyAnno(name="karan")//- Method Level
//    public static void main(@MyAnno(name="karan") String[] args) //- Parameter Level
//    {
//        @MyAnno(name="karan") //- Local Variable Level
//        int x;
//    }
//}
