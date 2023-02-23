package interNet;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Dome1 {
    public static void main(String[] args) throws Exception {
        System.out.println("===========客户端===========");
        /*建立接收者,指定接收的端口号*/
        DatagramSocket datagramSocket = new DatagramSocket(9980);

        /*建立接收的数据包*/
        byte[] bytes = new byte[1024];
        DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length);

        /*等待接收数据*/
        while (true) {
            datagramSocket.receive(datagramPacket);
            int length=datagramPacket.getLength();
            String s = new String(bytes, 0, length);
            System.out.print("端口"+datagramPacket.getSocketAddress()+"发送了->");
            System.out.println(s);

            if (s.equals("t")) {
                return;
            }
        }
    }
}
