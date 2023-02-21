package IO;

import sun.nio.cs.ext.GBK;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Test02 {
    public static void main(String[] args) throws IOException {
        InputStream input=new FileInputStream("src/one.txt");
        /*System.out.println((char)input.read());
        int b;
        while ((b = input.read()) !=-1){
            System.out.print((char) b);
        }*/


        /*
        * 字节数组读取文件,提高效率,解决中文无法读取的问题
        * */

       /* int read = input.read(bytes);
        System.out.println(read);//读取了五个字节*/
        int  b;
        byte[] bytes = new byte[1024];
        while ((b =input.read(bytes))!=-1){
            System.out.print(new String(bytes,0,b));//b用以读取到最后的时候，字节数组不满，而导致的乱码
        }




        input.close();
    }
}
