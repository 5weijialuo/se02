package s8;

import java.util.*;

public class Test04 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(3);
        list.add(454);
        list.add(3543);
        list.add(32);
        list.add(3332);
        list.add(2343);
        list.add(33);

        List<Integer> linkedList=new ArrayList<>();
        System.out.println(linkedList);
        System.out.println(list);
        Collections.copy(list,linkedList);
        System.out.println(linkedList.size());

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            if (iterator.next()==33)
           iterator.remove();
        }
        System.out.println(list);
    }

    public static <G> void t(G g){

    }
}
