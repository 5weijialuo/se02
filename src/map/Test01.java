package map;

import java.util.*;
import java.util.function.BiConsumer;

public class Test01 {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>();
        for (int i=0;i<11;i++){
            map.put(i,"my"+i);
        }
        System.out.println(map.values());
        System.out.println(map);
        Set<Integer> integers = map.keySet();
        System.out.println(integers);

        System.out.println("--------------");
        LinkedHashMap<String, Integer> map1= new LinkedHashMap<>();
        map1.put("tom",3423);
        map1.put("liSi",3432);
        Set<Map.Entry<String, Integer>> entries = map1.entrySet();
        for (Map.Entry<String, Integer> set:entries) {
            System.out.println(set.getKey()+"=====>"+set.getValue());
        }


        System.out.println("----------------lambda表达式遍历集合");
        map.forEach(
                (k,v)-> System.out.print(k+"========>"+v+"\t")
        );
        map1.forEach((s, integer) -> System.out.println(s+integer));


    }
}
