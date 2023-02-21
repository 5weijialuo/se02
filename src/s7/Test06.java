package s7;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Test06 {
    public static void main(String[] args) {
        Collection<String> list=new ArrayList<>();
        list.add("fsd1");
        list.add("fsd2");
        list.add("fsd3");
        list.add("tomcat1");
        list.add("tomcat2");
        list.add("tomcat3");
        Iterator<String> it=list.iterator();
       /* System.out.println(list.size());
        System.out.println(list.iterator());*/

        while (it.hasNext()){
            System.out.println(it.next());
        }


        System.out.println("lambda表达式forEach对集合进行迭代");
        /*lambda表达式forEach对集合进行迭代*/
        list.forEach(System.out::println);
    }
}
