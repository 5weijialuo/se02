package IO;

import java.io.*;


public class TransitionStream {
    public static void main(String[] args) {
        char[] chars=new char[1024];
        /*
                  字符转换流
                  1 获取普通字节流
                  2 将字节流中的内容转换到节点进行转换
                  3 使用buffer缓冲流进行输出
                  */
        try (
               InputStream stream=new FileInputStream("D:/javaSE/tom.txt");
               Reader t=new InputStreamReader(stream,"GBK");
               BufferedReader bufferedReader=new BufferedReader(t);
        ) {
            int dome;
            while ((dome=bufferedReader.read(chars))!=-1){
               int read = bufferedReader.read(chars, 0, dome);
                System.out.println(new String(chars,0,dome));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
