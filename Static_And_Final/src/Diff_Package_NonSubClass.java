import mypack1.Demo_Access_Modifiers;

public class Diff_Package_NonSubClass{
    public static void main(String[] args) {

        //Non-Subclass, Different Package
        Demo_Access_Modifiers d1 = new Demo_Access_Modifiers();

        d1.display();
//        System.out.println(d1.a + d1.b + d1.c + d1.d); // Cannot access a,b and c
    }
}
