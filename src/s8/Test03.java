package s8;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Test03 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList();
        list.add(3);
        list.add(454);
        list.add(3543);
        list.add(32);
        list.add(3332);
        list.add(2343);
        list.add(33);
        System.out.println(list);

        list.sort((o1, o2) -> {
            if (o1<o2){
                return o1-o2;
            }else {
                return o2-o1;
            }

        });
        System.out.println(list);

        list.sort((o1, o2) -> 0);
        Collections.reverse(list);
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);

        Collections.reverse(list);
        System.out.println(list);

        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));


        Collections.fill(list,2);
        System.out.println(list);
    }
}
