package s3;

import java.util.ArrayList;

public class Test06 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        String s="abcEFG";
        list.add("23");
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            list.add(i,String.valueOf(c));

        }
        System.out.println(list);
        System.out.println(list.remove("a"));
        System.out.println(list);
    }
}
