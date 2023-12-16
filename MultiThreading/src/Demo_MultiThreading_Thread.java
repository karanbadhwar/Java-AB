//class MyThread extends Thread
//{
//    @Override
//    public void run()
//    {
//        int i = 1;
//        while(i <= 5)
//        {
//            System.out.println(i + " Hello");
//            i++;
//        }
//    }
//}

public class Demo_MultiThreading_Thread extends Thread
{

    @Override
    public void run()
    {
        int i = 1;
        while(i <= 5)
        {
            System.out.println(i + " Hello");
            i++;
        }
    }

    public static void main(String[] args) {
        Demo_MultiThreading_Thread t = new Demo_MultiThreading_Thread();
        t.start();

        int i = 1;
        while (i <= 5)
        {
            System.out.println(i+" World");
            i++;
        }
    }
}
