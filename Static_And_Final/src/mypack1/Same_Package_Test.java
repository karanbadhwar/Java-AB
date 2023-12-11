package mypack1;

public class Same_Package_Test {
    public static void main(String[] args) {

    }

        Demo_Access_Modifiers d = new Demo_Access_Modifiers();
        public void show()
        {
//            System.out.println(d.a + d.b + d.c + d.d); // B cannot be accessed as that is Private in Super Class
        }

}
