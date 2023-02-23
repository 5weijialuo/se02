package interNet;

import java.io.IOException;
import java.net.InetAddress;
import java.util.Arrays;

public class Test01 {
    /*10.254.2.128*/
    public static void main(String[] args) throws IOException {
        InetAddress address= InetAddress.getByName("www.91yeye.net");
        System.out.println(address.getHostName());
        System.out.println(address.getHostAddress());
        boolean reachable = address.isReachable(100000);
        System.out.println(reachable);

        System.out.println("---------------------------------");

        InetAddress inetAddress=InetAddress.getLocalHost();
        System.out.println(inetAddress.getHostAddress());
        System.out.println(Arrays.toString(inetAddress.getAddress()));


    }
}
