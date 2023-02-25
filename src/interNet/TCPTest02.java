package interNet;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class TCPTest02 {
    public static void main(String[] args) throws Exception{
/*
* 服务端需要被动等待接收客户端发送的请求,
 服务端的工作是建立一个通信终端，并被动地等待客户端的连接。典型的TCP服务端执行如下操作：
1. 创建ServerSocket对象，绑定并监听端口
2. 通过accept监听客户端的请求
3. 建立连接后，通过输出输入流进行读写操作
4. 关闭相关资源
* */
        //等待接收客户端请求
        ServerSocket serverSocket=new ServerSocket(9091);
        /*建立管道*/
        Socket accept = serverSocket.accept();

        /*接收*/
        InputStream inputStream = accept.getInputStream();
        BufferedReader br=new BufferedReader(new InputStreamReader(inputStream));

        String s = "";
        while (true){
     if ((s= br.readLine())!=null){
       /* stream.flush();*/
         System.out.print("接收到"+accept.getRemoteSocketAddress()+"--->");
         System.out.println(serverSocket.getReceiveBufferSize()+"--->"+s);

     }
 }

    }
}
