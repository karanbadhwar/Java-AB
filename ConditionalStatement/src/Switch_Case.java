public class Switch_Case {
    public static void main (String[] args)
    {
        int n = 2;

        //In If..Else every condition gets checked untill the condition has met pr goes to else
//        if(n==1){
//            System.out.println("One");
//        } else if(n==2){
//            System.out.println("Two");
//        }else if(n==3){
//            System.out.println("Three");
//        } else {
//            System.out.println("Not a Valid Number");
//        }

        //IN switch .. case the value gets checked with the Case-value which saves time
        switch (n)
        {
            case 1: System.out.println("one");
            break;

            case 2: System.out.println("Two");
            break;

            case 3: System.out.println("Three");
            break;

            default:System.out.println("Invalid");
            break;
        }
    }
}
