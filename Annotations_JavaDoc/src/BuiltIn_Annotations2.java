import java.lang.annotation.*;


//@Retention(RetentionPolicy.CLASS) // To tell until what Step the Annotations gonna be Retained or Present
//@Documented It tells compiler that it will be present even inside Documentation, when we create Docs using JavaDoc tools

@Target(value= {ElementType.LOCAL_VARIABLE, ElementType.METHOD})
@Inherited // Means SubCLass of Annotated Super class will also have these Annotations
@interface Anno
{
    String name();
    String project();
    String date() default "today";
    String version() default "13";
}


public class BuiltIn_Annotations2 {

    int data;

    @Anno(name="karan", project="Bank")
    public static void main(String[] args) {
        @Anno(name="karan", project="Bank")
        int x;
    }
}
