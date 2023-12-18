class MyData
{
    synchronized public void display(String str) {
        for (int i = 0; i < str.length(); i++)
        {
            System.out.print(str.charAt(i));
            try
            {
                Thread.sleep(100);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
        System.out.println();
    }
}

class MyThread1 extends Thread
{
    MyData d;

    public MyThread1(MyData d)
    {
        this.d = d;
    }

    public void run()
    {
        d.display("Hello World");
    }
}

class MyThread_2 extends Thread
{
    MyData d;

    public MyThread_2(MyData d)
    {
        this.d = d;
    }

    public void run()
    {
        d.display("Welcome All");
    }
}

public class Demo_Synchronisation {
    public static void main(String[] args)
    {
        MyData data = new MyData();
//        MyData data2 = new MyData(); //If this being passed to t2 Object, then display method will run simultaneously
            // Cause Synchronisation happens at Object Level ...

        MyData data2 = new MyData();

        MyThread1 t = new MyThread1(data);
        MyThread_2 t2 = new MyThread_2(data);
//        MyThread_2 t3 = new MyThread_2(data2);

        t.start();
        t2.start();
//        t3.start();
    }
}
