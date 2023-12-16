class MyRunnable implements Runnable
{
    @Override
    public void run()
    {
        int i = 1;
        while(i <= 5)
        {
            System.out.println(i + " Hello world");
            i++;
        }
    }
}

//Implementing from Runnable Must Override Run() otherwise it will become Abstract CLass
class MyRunnableThread implements Runnable
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
}

public class Demo_MultiThreading_Runnable {
    public static void main(String[] args) {
        MyRunnableThread mrt = new MyRunnableThread();
        MyRunnable mr = new MyRunnable();
        Thread th = new Thread(mrt);
        Thread t = new Thread(mr);
        th.start();
        t.start();

        int i  = 1;
        while(i <= 5)
        {
            System.out.println(i + " World");
           i++;
        }
        MyRunnable mr1 = new MyRunnable();
//    t.start(); As Thread once is Over cannot be restarted
    }
}
