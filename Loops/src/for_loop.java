public class for_loop {
    public static void main (String[] args)
    {
        //For Loop [Increment]
        for(int i = 0; i<= 10; i++){
//            System.out.println(i);
        }

        //For Loop [Decrement]
        for(int i = 10; i > 0; i--){
//            System.out.println(i);
        }

        //For Loop [Integer outside of Loop]
        int i = 0;
        for(;i<=10; i++){
//            System.out.println(i);
        }

        //For Loop [Multiple Variable Initialization]
        for(int j = 0, k= 10; j<=k; j++, k-- ){
//            System.out.format("J: %d And K: %d\n", j,k);
            System.out.format("J: %1$d And K: %2$d \n", j,k);
        }

    }
}
