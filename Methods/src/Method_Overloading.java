public class Method_Overloading {

//    static int max(int x, int y)
//    {
//        return x>y?x:y;
//    }

//    static byte max(byte x, byte y){
//        return x>y?x:y;
//    }
//
    static float max(float x, float y)
    {
        return x>y?x:y;
    }

//    static int max (int x, int y, int z)
//    {
//       return  x>y && x>z? x: (y>z? y:z);
//    }

    public static void main (String[] args)
    {
        System.out.println(max(10,5)); // It will run the method with Float as Integral Type is compatible with Float
//        System.out.println(max(10.3f,5.5f));
    }
}
