public class Incre_Decre {
    public static void main(String[] args) {
        int x = 5, y;
        y = x++;

        System.out.println("Y: " + y);

        char a = 'A';
        a++;
        System.out.println(a);

        byte b = 5;
        b = b++; //It is Fine
//        b = b + 1; // It will be an error as 1 is Integer as when we perform Arithmetic Operations on byte short and Int the result is always Int

    }
}
