package stearmTest;

import s5.Int;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

public class Test01 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("周智若");
        list.add("赵敏");
        list.add("张强");
        list.add("张三丰子");
        list.add("荀子");
        List<String> l1 = new ArrayList<>();
        List<String> l2 = new ArrayList<>();
        System.out.println(list);
        System.out.println(list.get(0).length()==3);
        for (String s : list) {
            if (s.startsWith("张")) {
                l1.add(s);
            }
            if (  s.length() == 3&&s.startsWith("张")) {

                l2.add(s);
            }
        }
        System.out.println(l1);
        System.out.println(l2);


        System.out.println("---------------------");
        /*stream流实现*/
         list.stream().filter(s ->  s.startsWith("张")).forEach(System.out::println);
         list.stream().filter(s -> s.startsWith("张")).limit(1).forEach(System.out::println);
        System.out.println("--------");
         list.stream().filter(s -> s.startsWith("张")&& s.length()==3).forEach(System.out::println);


         list.stream().map(s -> new User(1,s)).forEach(System.out::println);
        System.out.println("---------------------");


         Stream<Integer> s1=Stream.of(22);
         Stream<String> s2=Stream.of("com","www","   ","alibaba");
         Stream<Object> s3=Stream.concat(s1,s2);
        s3.forEach(System.out::print);

        System.out.println("---------------------");

        list.stream().map(String::length).skip(1).limit(3).forEach(System.out::println);

    }
}