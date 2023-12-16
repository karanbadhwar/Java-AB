//Methods Covered in this video are :-
//Daemon
//Join
//Yield

class MyThread2 extends Thread
{
    @Override
    public void run ()
    {
        int count = 1;
        while(true)
        {
            System.out.println(count++ + " My Thread");

        }
    }
}
public class Demo_Thread_Methods2 {
    public static void main(String[] args) {
        MyThread2 t = new MyThread2();
        t.start();

        int count = 1;
        while(true)
        {
            System.out.println(count++ + " Main Thread");
            //On Every Count Iteration it is holding the Process to let other Thread run
            Thread.yield();

        }

    }
}


//Daemon Thread
//-----------------------------------------
//MyThread2 t = new MyThread2();
//        t.setDaemon(true);
//        t.start();
//        try
//        {
//           Thread.sleep(10);
//        }
//        catch(Exception e) {
//        System.out.println(e);
//        }


//Join Thread
//------------------------------------------
//public static void main(String[] args) {
//    MyThread2 t = new MyThread2();
//    t.setDaemon(true);
//    t.start();
//
//      //Getting Current Thread, even though it was not a Thread, but we got the ref of the Current Running Thread
//     mainThread =  Thread.currentThread();
//
//    try
//    {
//        mainThread.join();
////            mainThread.join(1000);
//    }
//    catch (InterruptedException e)
//    {
//        System.out.println(e);
//    }
//
//}