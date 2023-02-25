package interNet.dome;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;



public class Dome3 {
    /*客户端*/
    public static void main(String[] args) {
        try {
            Socket socket=new Socket(InetAddress.getLoopbackAddress(),8889);
            OutputStream stream=socket.getOutputStream();
            PrintStream ps=new PrintStream(stream);
            Scanner scanner = new Scanner(System.in);

            while (true){
                String s = scanner.nextLine();
                ps.println(s);
                ps.flush();
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
