package interNet;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class TCPTest01 {
    public static void main(String[] args) throws Exception {
/*
* 客户端需要发送请求连接的信息
* 客户端向服务器端发送连接请求后，就被动地等待服务器的响应。典型的TCP客户端要经过下面三步操作：
1. 创建一个Socket实例：构造函数向指定的远程主机和端口建立一个TCP连接；
2. 通过套接字的I/O流与服务端通信；
3. 使用Socket类的close方法关闭连接。
* */
        //连接到服务器对象
        Socket socket = new Socket(InetAddress.getLocalHost(),9090);
        //建立通信管道
        OutputStream outputStream = socket.getOutputStream();
        /*用高级流封装数据*/
        PrintStream stream=new PrintStream(outputStream);
        Scanner scanner = new Scanner(System.in);
        /*System.out.print("可以开始发送--->");*/
        String s;
        /*连续发送时消息给服务端,直到输入exit,退出客户端*/
        while (!((s=scanner.nextLine()).equals("exit"))){
            stream.println("可以开始发送----->"+s);
            stream.flush();
        }

        socket.close();
    }
}
