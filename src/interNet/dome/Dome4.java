package interNet.dome;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Dome4 {
    /*服务端*/
    /*服务端使用多线程完成接收多端通信*/
    public static void main(String[] args) {

        try {
            ServerSocket serverSocket=new ServerSocket(8889);

            while (true){
                Socket accept = serverSocket.accept();

                /*将线程独立*/
                new Thread(new MyThread(accept)).start();


            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
class MyThread implements Runnable{
    private Socket socket;
    public MyThread(Socket socket){
        this.socket=socket;
    }
    @Override
    public void run() {
        while (true){
            try {
                if (socket==null){
                    System.exit(0);
                }
                InputStream inputStream = socket.getInputStream();
                BufferedReader br=new BufferedReader(new InputStreamReader(inputStream));
                String s;
                if (((s=br.readLine())!=null)) {
                    System.out.println(socket.getInetAddress()+"说:--->"+s);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}