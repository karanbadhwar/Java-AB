//In This We have Covered Constructor and Some Getter and Setter methods. Moreover, with Sleep() and with Interrupt()

class MyThread extends Thread
{
    public MyThread(String name)
    {
        super(name);
//        this.setPriority(8);
//        this.setPriority(Thread.MAX_PRIORITY);
    }

    @Override
    public void run ()
    {
//        System.out.println("Calling from My Thread Class");
        int i = 1;

        while(true)
        {
            System.out.println(i++);

            try
            {
                Thread.sleep(1000);
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }

        }
    }
}

class MyRun implements Runnable
{
    @Override
    public void run() {}
}

public class Demo_Thread_Methods1
{
    public static void main(String[] args) {
        MyThread t = new MyThread("My Thread 1");
        t.start();
        t.interrupt();



    }

}


//Constructors with Only Thread Class
//--------------------------------------------

//        Thread t = new Thread("My Name"); // new Thread(String name)
//        Thread t = new Thread(new MyRun()); // new Thread(Runnable r)
//        Thread t = new Thread(new MyRun(), "My Name"); // new Thread(Runnable r, String name)

//Constructor of Extended Class From Thread
//---------------------------------------------

//class MyThread extends Thread
//{
//    public MyThread(String name)
//    {
//        super(name);
//    }
//}

//public static void main(String[] args) {
//    MyThread t = new MyThread("My Thread 1");
//}


//Methods
//----------------------------------
//MyThread t = new MyThread("My Thread 1");
//        t.setPriority(Thread.MAX_PRIORITY);
//        t.setPriority(8);
//        System.out.println("Thread ID: "+t.threadId()); // As Instance,getId() is Deprecated
//        System.out.println("Thread Name: "+t.getName());
//        System.out.println("Thread Priority: "+t.getPriority());
//        System.out.println("Thread State: "+t.getState());
//
//        t.start();
//
//        System.out.println("Thread State After calling start(): "+t.getState());
//
//        System.out.println("Alive: "+t.isAlive());
//        System.out.println("Thread State After calling start(): "+t.getState());

//Sleep Method
//----------------------------------------
//@Override
//public void run ()
//{
//    int i = 1;
//    while(true)
//    {
//        System.out.println(i++);
//        try
//        {
//            Thread.sleep(1000);
//        }
//        catch(InterruptedException e)
//        {
//            System.out.println(e);
//        }
//
//    }
//}