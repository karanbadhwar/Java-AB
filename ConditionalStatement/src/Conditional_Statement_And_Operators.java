public class Conditional_Statement_And_Operators {
    public static void main (String[] args){
        int a=5,b=10,c=15;
        float d=5.4f,e=5.5f,f=15;

        //Relational and Logical Operators

//        System.out.println(a < b && a < c); //True
//        System.out.println(a < b && a > c); //False
//        System.out.println(d < b && a < e); //True
//        System.out.println(d > b || f < c); //False

        //Conditional Statements

        int n = 5;
        int negN = -5;

//        if(negN >= 0) {
//        System.out.println("positive");
//        } else {
//            System.out.println("Negative");
//        }

        //Else-if Ladder

        int val1 = 5,val2 = 10, val3 =15;

        if(val1 > val2 && val1 > val3){
            System.out.println(val1);
        } else if(val2 > val3){
            System.out.println(val2);
        } else {
            System.out.println(val3);
        }

    }
}
