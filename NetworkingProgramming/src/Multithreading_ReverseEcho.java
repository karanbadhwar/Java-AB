import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;



public class Multithreading_ReverseEcho extends Thread {

    Socket stk;
    int t;

    public Multithreading_ReverseEcho(Socket st, int t)
    {
        stk = st;
        this.t = t;
    }
    public void run()
    {
//        synchronized (Multithreading_ReverseEcho.class) {


            try {
                BufferedReader br = new BufferedReader(new InputStreamReader(stk.getInputStream()));
                PrintStream ps = new PrintStream(stk.getOutputStream());

                String msg;
                StringBuilder sb;

                do {
                    msg = br.readLine();
                    sb = new StringBuilder(msg);
                    sb.reverse();
                    msg = sb.toString();

                    for (int i = 0; i < 10; i++) {
                        Thread.sleep(1000);
                        System.out.println("Thread "+t+" "+i);
                    }

                    ps.println(msg);
                } while (!msg.equals("dne"));
                stk.close();
            } catch (Exception e) {
                System.out.println(e);
            }
//        }
    }

    public static void main(String[] args) throws Exception{
        ServerSocket server = new ServerSocket(2000);
        Socket stk;
        int count = 1;
        Multithreading_ReverseEcho mre;
        do {
            stk = server.accept();
            System.out.println("Client Connected: "+count++);

            synchronized (Multithreading_ReverseEcho.class) {


                mre = new Multithreading_ReverseEcho(stk, count);
                mre.start();
            }

        } while(true);

    }
}

class MultiThreading_Client
{
    public static void main(String[] args) throws Exception{
        Socket stk = new Socket("localhost", 2000); // or type IPv4 instead of localhost

        BufferedReader keyb = new BufferedReader(new InputStreamReader(System.in));

        BufferedReader br = new BufferedReader(new InputStreamReader(stk.getInputStream()));
        PrintStream ps = new PrintStream(stk.getOutputStream());

        String msg;
        StringBuilder sb;

        do {
            msg = keyb.readLine();
            ps.println(msg);
            msg = br.readLine();
            System.out.println("Reverse Msg: "+msg);
        }while(!msg.equals("end"));

        stk.close();
    }
}