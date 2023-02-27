package interNet.dome;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.concurrent.*;


/*即时通信*/
public class Dome6 {
    /*线程池优化服务端*/
    /*存储所有的客户端信息方便端口信息转发*/
    public static ArrayList<Socket> arrayList=new ArrayList<>();
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
                arrayList.add(accept);//将每一个客户端进行存储
                service.execute(thread);

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
                    /*客户端输入exit退出客户端*/
                    if (s.equals("exit")){
                        br.close();
                        return;
                    }
                    System.out.println(socket.getRemoteSocketAddress()+"说:--->"+s);
                    sendAll(s);
                }
            } catch (IOException e) {
                Dome6.arrayList.remove(socket);
                e.printStackTrace();
            }
        }
    }

    /*进行消息转发的方法*/
    private void sendAll(String line) throws IOException {
        for (Socket socket:Dome6.arrayList){
            PrintStream stream=new PrintStream(socket.getOutputStream());
            stream.println(line);
            stream.flush();
        }

    }
}

