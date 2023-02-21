package map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test03 {
    public static void main(String[] args) {
        List list=new ArrayList();
        list.add("tom");
        list.add("joPen is Dog");
        Collections.unmodifiableList(list);
        System.out.println(list);
        list.add("MLL");
        list.remove("tom");


    }
}
