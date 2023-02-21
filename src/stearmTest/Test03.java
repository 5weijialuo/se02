package stearmTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test03 {
    public static void main(String[] args) {
        List<String> li = new ArrayList<>();
        li.add("张无忌");
        li.add("周智若");
        li.add("赵敏");
        li.add("张强");
        li.add("张三丰子");
        li.add("荀子");
        Stream<String> stringStream = li.stream().filter(e -> e.startsWith("张"));
        List<String> collect = stringStream.collect(Collectors.toList());
        System.out.println(collect);

        /*Set<String> collect1 = stringStream.collect(Collectors.toSet());
        System.out.println(collect1);*/
    }
}
