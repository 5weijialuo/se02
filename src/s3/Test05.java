package s3;

import java.util.ArrayList;
import java.util.List;

public class Test05 {
    public static void main(String[] args) {
        String s="abcdefg";
        ArrayList list=new ArrayList();
        list.add(324);
        System.out.println(list.size());
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            System.out.println(c);
            list.add(i,c);
        }
        System.out.println(list.size());
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        boolean empty = list.isEmpty();
        System.out.println(empty);

        System.out.println(list);
        List<String> list1=new ArrayList<>();
        list1.addAll(list);
        System.out.println(list1);
        boolean b = list.remove("324");
        System.out.println(b);
        System.out.println(list.remove(1));
        list.add(s);
        System.out.println(list);

    }
}
