enum Dept
{
    CS("Karan", "Block A"),
    IT("Badhwar", "Block B"),
    CIVIL("KB", "Block C"),
    ECE("KBK", "Block D");

    private String head;
    String location;

    private Dept(String head, String loc)
    {
        this.head = head;
        this.location = loc;
    }

    public void display()
    {
        System.out.println(this.name() + " " + this.ordinal() + " ");
    }

    public String headName()
    {
        return this.head;
    }

    public String getLocation()
    {
        return  this.location;
    }
}

public class Enum
{
    public static void main(String[] args) {
        Dept d = Dept.CIVIL;

        d.display();

        System.out.println(d.headName());

        System.out.println(d.getLocation());


//        switch (d)
//        {
//            case CS:
//                System.out.println("Head Karan");
//                break;
//            case IT:
//                System.out.println("Head KB");
//                break;
//
//            case CIVIL:
//                System.out.println("Head Badhwar");
//                break;
//
//            case ECE:
//                System.out.println("Head KBK");
//                break;
//
//        }
    }
}

//public class Enum {
//    public static void main(String[] args) {
//        Dept d = Dept.ECE;
//
////        System.out.println(d.ordinal());
////        System.out.println(d.IT.ordinal());
//
////        System.out.println(Dept.valueOf("IT"));
//
//        Dept list[] = Dept.values();
//
////        for(Dept x: list)
////            System.out.println(x);
//    }
//}
