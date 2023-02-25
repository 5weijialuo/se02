package interNet.dome;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.*;

public class Dome5 {
    /*线程池优化服务端*/
    public static void main(String[] args) {
        /*创建线程池*/
        ExecutorService service=new ThreadPoolExecutor(3,5,3, TimeUnit.SECONDS
        ,new ArrayBlockingQueue<>(6), Executors.defaultThreadFactory(),new ThreadPoolExecutor.AbortPolicy());

        try {
            ServerSocket serverSocket=new ServerSocket(8889);

            while (true){
                Socket accept = serverSocket.accept();
                /*将独立线程交由线程池进行管理*/
                Thread thread = new Thread(new MyThread(accept));
                service.execute(thread);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

