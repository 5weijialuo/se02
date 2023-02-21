package IO;

import java.io.*;

/*
* 字符缓存流
* */
public class Buffer02 {
    public static void main(String[] args) {
        try (
                Writer writer=new FileWriter("D:/tom.txt");
                BufferedWriter bufferedWriter=new BufferedWriter(writer);
                Reader b=new FileReader("src/one.txt");
                BufferedReader bufferedReader=new BufferedReader(b);
                ){
            String s;
            while ((s=bufferedReader.readLine())!=null){
                bufferedWriter.write(s);
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
