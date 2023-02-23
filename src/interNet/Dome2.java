package interNet;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class Dome2 {
    public static void main(String[] args) throws Exception {
        System.out.println("===========服务端===========");
        /*建立发送端,    */
        DatagramSocket client=new DatagramSocket();

        Scanner scanner = new Scanner(System.in);
        String data="";
        System.out.print("发送:::::");
        /*创建需要发送的数据包*/
        while (!(data=scanner.nextLine()).equals("q")){
            System.out.print("发送:::::");

            /*
            * 广播的网址,对本网段内,进行广播式发送
            * */
            DatagramPacket datagramPacket=new DatagramPacket(data.getBytes(),data.getBytes().length, InetAddress.getByName("255.255.255.255"),9980);
            /*发送*/
            client.send(datagramPacket);
        }
    }
}
