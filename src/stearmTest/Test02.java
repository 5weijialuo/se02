package stearmTest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.stream.Stream;

public class Test02 {
    public static void main(String[] args) {
        Collection<String> col=new ArrayList<>();
        col.add("cm");
        col.add("tm");

        long count = col.stream().count();
        System.out.println(count);


    }
}
