package IO;

import java.io.*;

/*
* 文件的复制
* 先读取到文件中的所有字节,如何吸入到指定文件中
* */
public class Test04 {
    public static void main(String[] args) {
        File file = new File("src/two.txt");
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        OutputStream outputStream= null;
        try {
            outputStream = new FileOutputStream("src/one.txt",true);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        /*一次读取到文件中所有的内容*/
        /*byte[] bytes = new byte[(int) file.length()];*/
        byte[] bytes=new byte[1024];
        int read = 0;
        while (true){
            try {
                if (!((read = fileInputStream.read(bytes))!=-1)) break;
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                outputStream.write(bytes,0,read);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        /* System.out.println(new String(bytes,0,read));*/

       /* String s = new String(bytes, 0, read);*/
        /*写入字节数组中的所有内容*/

        try {
            outputStream.flush();
            outputStream.close();
            fileInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        

    }
}
