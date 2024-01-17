import java.net.Socket;
import java.net.ServerSocket;
import java.io.*;

public class Reverse_Echo_Server_Sockets {
    public static void main(String[] args) throws Exception {
        ServerSocket server = new ServerSocket(2000);

        Socket stk = server.accept();

        BufferedReader br = new BufferedReader(new InputStreamReader(stk.getInputStream()));

        PrintStream ps = new PrintStream(stk.getOutputStream());

        String msg;
        StringBuilder sb;

        do {
            msg = br.readLine();
            sb = new StringBuilder(msg);
            sb.reverse();
            msg = sb.toString();
            ps.println(msg);
        } while(!msg.equals("dne"));
        stk.close();
        server.close();

    }
}

class Client
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
