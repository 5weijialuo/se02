package interNet;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.nio.charset.StandardCharsets;

/*
 *   建立接收端
 *  */
public class ServerDome1 {
    public static void main(String[] args) throws  Exception{

        System.out.println("===========客户端===========");
        /*建立接收者,指定接收的端口号*/
        DatagramSocket datagramSocket=new DatagramSocket(9989);

        /*建立接收的数据包*/
        byte[] bytes=new byte[1024*64];
        DatagramPacket datagramPacket=new DatagramPacket(bytes,bytes.length);

        /*等待接收数据*/
        while (true){
            datagramSocket.receive(datagramPacket);
            int length = datagramPacket.getLength();
            System.out.println("接收的数据包的大小--------->"+length);

            String s=new String(bytes,0,length);
            System.out.println(s);

            if (s.equals("t")){
                return;
            }
        }


       /* System.out.println(datagramPacket.getAddress());
        System.out.println(datagramPacket.getPort());
        System.out.println(datagramPacket.getSocketAddress());*/


        /*datagramSocket.close();*/
    }
}
