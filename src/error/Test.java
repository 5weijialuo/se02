package error;


import s5.Int;

import java.io.FileInputStream;
import java.io.InputStream;

public class Test {
    public static void main(String[] args){
        try {
            System.out.println("可能抛出异常");
            time(11);

        }
        catch (Exception e) {
            e.printStackTrace();
            System.out.println("抛出异常");
        }
        System.out.println("执行失败");
        int compare = Integer.compare(11, 22);
        System.out.println(compare);
    }

    public static void time(int d) throws Exception {
       InputStream stream=new FileInputStream("E:/jq.png");

    }

}
