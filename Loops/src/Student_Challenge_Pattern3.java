public class Student_Challenge_Pattern3 {
    public static void main (String[] args)
    {
        //Pattern 8
//        * * * * *
//        * * * *
//        * * *
//        * *
//        *
//        for(int i = 1; i <=5; i++)
//        {
//            for (int j = 1; j <=5; j++)
//            {
//                if(j >= i )
//                {
//                    System.out.format("* ");
//                } else {
//                    System.out.format("  ");
//                }
//            }
//            System.out.println();
//        }

        //Pattern 9
//                *
//              * *
//            * * *
//          * * * *
//        * * * * *

//        for(int i = 1; i <=5; i++)
//        {
//            for(int j = 1; j <=5; j++)
//            {
//                if((i + j) > 5)
//                {
//                    System.out.print("* ");
//                } else
//                    System.out.print("  ");
//            }
//            System.out.println();
//        }


        //Pattern 10 IMPORTANT

        for(int i = 1; i<=5; i++)
        {
            for(int j = 1; j <=5; j++)
            {
                if(j+i > 5){
                    System.out.format("* ");
                } else
        System.out.format("  ");
    }
            for(int k = 5; k >0; k--){
        if(k * i >= 10){
            System.out.format("* ");
        } else
            System.out.format("  ");
    }
            System.out.println();
}

        for(int a = 1; a <=5; a++)
        {
            for(int b = 1; b <= 5; b++)
            {
                if(b>a)
                    System.out.format("* ");
                else
                    System.out.format("  ");
            }
            for(int c =1; c <=5; c++){
                if(c + a < 5)
                    System.out.format("* ");
                else
                    System.out.format("  ");
            }
            System.out.println();
        }


    }
}
