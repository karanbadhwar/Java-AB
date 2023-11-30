public class Practice_Variable_arguments {

    //VarArgs - Variable Arguments - Variable Number of Arguments
//    static void show (int ...A)
//    {
//        for (int x:A)
//            System.out.println(x);
//    }

    static void showList (int start , String ...S)
    {
       for(int i = 0; i < S.length; i++)
       {
           System.out.println(start +". "+S[i]  );
           start++;
       }
    }

    public static void main (String ...args)
    {
//        show();
//        show(11);
//
//        //Passing an Array to VarArgs
//        show(new int[]{2,3,4,5});

        // with strings
        showList(5,"karan", "Badhwar", "KB", "JOJO");

    }
}
