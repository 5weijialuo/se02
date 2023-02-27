package interNet.dome;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;



public class Dome3 {
    /*客户端*/


    public static void main(String[] args) {
        try {
            Socket socket=new Socket(InetAddress.getLoopbackAddress(),8889);

            /*建立一个线程,专门负责客户端的消息读取,接收服务端的消息推送*/

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
class MyThreads implements Runnable{
    private Socket socket;
    public MyThreads(Socket socket){
        this.socket=socket;
    }
    @Override
    public void run() {
        while (true){
            try {
                /*if (socket==null){
                    System.exit(0);
                }*/
                /*读取服务端转发过来的消息*/
                InputStream input = socket.getInputStream();
                BufferedReader br=new BufferedReader(new InputStreamReader(input));
                String s;
                if (((s=br.readLine())!=null)) {
                    /*客户端输入exit退出客户端*/
                    if (s.equals("exit")){
                        br.close();
                        return;
                    }
                    System.out.println(socket.getRemoteSocketAddress()+"说:--->"+s);
                }
            } catch (Exception e) {
                System.out.println("服务端拒绝你的访问");
            }
        }
    }
}