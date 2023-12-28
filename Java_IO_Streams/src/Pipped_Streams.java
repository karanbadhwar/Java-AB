import java.io.*;

class Producer extends Thread
{
    OutputStream os;

    public Producer( OutputStream o)
    {
        this.os = o;
    }

    public void run()
    {
        int counter = 1;

        while (true)
        {
            try
            {
                os.write(counter);
                os.flush();

                System.out.println("Producer "+counter);
                System.out.flush();
               Thread.sleep(1000);
                counter++;
            }catch(Exception e)
            {
                System.out.println(e);
            }

        }
    }
}

class Consumer extends Thread
{
    InputStream is;

    public Consumer(InputStream i)
    {
        this.is = i;
    }

    @Override
    public void run()
    {
        int x ;

        while(true)
        {
            try
            {
                x = is.read();
                System.out.println("Consumer "+x);
                System.out.flush();
                Thread.sleep(1000);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }

        }

    }
}

public class Pipped_Streams
{
    public static void main(String[] args) throws IOException {
        PipedInputStream pis = new PipedInputStream();
        PipedOutputStream pos = new PipedOutputStream();

        pis.connect(pos);
//        pos.connect(pis); Both ways are Same

        Producer p = new Producer(pos);
        Consumer c = new Consumer(pis);
        p.start();
        c.start();
    }
}
