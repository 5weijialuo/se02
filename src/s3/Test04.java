package s3;

import java.util.ArrayList;

public class Test04 {
    public static void main(String[] args) {
        ArrayList<Object> objects = new ArrayList<>();
        objects.add(3);
        objects.add(objects);
        Object o = objects.get(0);
        System.out.println(o);
        System.out.println(objects.get(1));



        String name="rRE";
        String password="rrE";
        System.out.println(name.equalsIgnoreCase(password));
    }


}
