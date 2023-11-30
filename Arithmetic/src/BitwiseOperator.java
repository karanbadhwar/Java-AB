public class BitwiseOperator {
    public static void main (String[] args)
    {
//        int x = 10; In Decimal
//        int x = -0b1010;

//        int y = 0b0110; In Binary

        //Below is written in HexaDecimal
//        int y = 0X6;
//        int z;
        //And Operator (&)
//        z = x & y;

        //OR Operator (|)
//        z = x | y;

        //XOR Operator (^)
//        z = x ^ y;

//        System.out.println("z: "+z);

        //Shifts
//        int a = 0b1000;
//        int b;

        //Left Shift <<
//        b = a<<2;
        // b = a * 4 as it is shifted 2 place base(2)power(E)2

        //Right shift >>
//        b = a >> 2;
        // b = a / 4 it is shifted 2 places

//        System.out.println("b: " + b + " and  " + "a: " + a);

        // Signed Right Shift
//        int negInt = -0b1010;

//        int normalInt ;

//        normalInt = negInt >>> 1;

//        System.out.println(normalInt);


        // Bit Pattern for Example Y value
//        int x = 0b1010;
//        int y = x >>>1;


        // Not Operator
        int x = 0b1010;
        int y;

        y = ~x;
        System.out.println(String.format("%s", Integer.toBinaryString(x)));
        System.out.println(String.format("%32s", Integer.toBinaryString(y)));
        System.out.println(y);

    }
}
