package IO;


import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

public class Test01 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String s="不逢冬怎迎春";
        byte[] bytes = s.getBytes(StandardCharsets.UTF_8);
        System.out.println(bytes.length);
        System.out.println(bytes.toString());

        byte[] gbks = s.getBytes("GBK");
        System.out.println(gbks);
        System.out.println(gbks.length);
        String s1=new String(gbks, "GBK");
        System.out.println(s1);

        String s2=new String(gbks,"UTF-8");
        System.out.println(s2);

    }

}