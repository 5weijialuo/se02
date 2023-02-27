package interNet.dome;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.concurrent.*;

public class Dome5 {
    /*线程池优化服务端*/


    public static void main(String[] args) {
        /*创建线程池*/
        ExecutorService service=new ThreadPoolExecutor(3,5,3, TimeUnit.SECONDS
        ,new ArrayBlockingQueue<>(2), Executors.defaultThreadFactory(),new ThreadPoolExecutor.AbortPolicy());
        try {
            ServerSocket serverSocket=new ServerSocket(8889);

            while (true){
                Socket accept = serverSocket.accept();
                /*将线程封装成一个个独立的任务,而不是单独的线程*/
                System.out.println(accept.getRemoteSocketAddress()+"上线了!");
                /*每一个线程任务都会交给线程池进行处理!*/
                Thread thread = new Thread(new MyThread(accept));
                service.execute(thread);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}




