package interNet;

import java.net.*;
import java.util.Scanner;

/*
*   建立发送端
*  */
public class ClientDome1 {
    public static void main(String[] args) throws Exception {

        System.out.println("===========服务端===========");
        /*建立发送端,    */
        DatagramSocket client=new DatagramSocket();

        Scanner scanner = new Scanner(System.in);
        String data="";
        /*创建需要发送的数据包*/
        while (!(data=scanner.nextLine()).equals("q")){
            System.out.println("将要发送的数据包大小------->"+data.length());
            System.out.println(data);
            DatagramPacket datagramPacket=new DatagramPacket(data.getBytes(),data.getBytes().length, InetAddress.getLocalHost(),9989);
            /*发送*/
            client.send(datagramPacket);
        }



        client.close();
    }
}
