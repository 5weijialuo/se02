package s8;

import s5.Int;

import java.net.UnknownHostException;
import java.util.*;

public class Test02 {
    public static void main(String[] args) throws UnknownHostException {
        Collection<String>  set=new HashSet<>();
        set.add("tom");
        set.add("java");
        set.add("spring");
        set.add("java");
        for (String s : set) {
            System.out.println(s);
        }

        TreeMap<Integer,String> map=new TreeMap<>();
        map.put(0,"fs");
        map.put(1,"fw");
        map.put(2,"fe");
        map.put(3,"fr");
        map.put(2,"ft");
        System.out.println(map.replace(5,"3"));
        for (int i = 0; i < map.size(); i++) {
            System.out.println(map.get(i));
        }
        System.out.println(map.values());

        System.out.println("----------------------------");

        for (Map.Entry<Integer,String> entry : map.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
        System.out.println(map.ceilingEntry(1));
        System.out.println(map.get(1));
        System.out.println(map.entrySet());




       /* InetAddress inetAddress=InetAddress.getLocalHost();
        System.out.println(inetAddress.getHostAddress());
        System.out.println(inetAddress.getHostName());*/

    }
}
