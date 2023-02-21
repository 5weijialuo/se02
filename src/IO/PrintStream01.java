package IO;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class PrintStream01 {
    public static void main(String[] args) {
        try {
            PrintStream stream=new PrintStream("src/one.txt");
            stream.println("想干嘛就干嘛1");


            System.setOut(stream);//打印流重定向

            System.out.println("将进酒");
            System.out.println("君不见黄河之水天上来!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
