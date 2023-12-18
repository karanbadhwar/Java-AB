class My_Data
{
    int value;
    //Flag for Inter-Thread Communication
    boolean flag = true;

    //Setter
    synchronized public void setValue(int x)
    {
        while(flag != true)
            try
            {
                wait();
            }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }

        value = x;

        flag = false;

        notify(); // Notify will inform one of the Threads waiting at the Object's Monitor
    }

    //Getter
    synchronized public int getValue()
    {
        while(flag!= false)
            try
            {
                wait();
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }
        int x = 0;
        x = value;

        flag = true;

        notify();
        return x;
    }
}

class Producer extends Thread
{
    My_Data d;

    public Producer(My_Data data)
    {
        this.d = data;
    }

    @Override
    public void run()
    {
       int count = 0;
       while(true)
       {
           d.setValue(count);
           System.out.println("Producer: "+count);
           count++;

           try
           {
               Thread.sleep(1000);
           }
           catch( InterruptedException e)
           {
               System.out.println(e);
           }
       }
    }
}

class Consumer extends Thread
{
    My_Data d;

    public Consumer(My_Data data)
    {
        d = data;
    }

    @Override
    public void run()
    {
        int value;

        while(true)
        {
            value = d.getValue();
            System.out.println("Consumer: "+value);
            try
            {
                Thread.sleep(1000);
            }
            catch( InterruptedException e)
            {
                System.out.println(e);
            }
        }
    }
}

public class Demo_InterThread_Communication
{
    public static void main(String[] args)
    {
        My_Data data = new My_Data();
        Producer p = new Producer(data);
        Consumer c = new Consumer(data);

        p.start();
        c.start();
    }
}
