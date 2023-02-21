package IO;

import java.io.*;

public class Test05 {
    public static void main(String[] args) {
        char[] chars=new char[1024];
/*
*将one.txt文件中的内容写入there.txt文件中
* */
        try (
                FileReader fileReader = new FileReader("src/one.txt");
                FileWriter fileWriter = new FileWriter("src/there.txt",true);
        ){
            int dome;
            while ((dome=fileReader.read(chars))!=-1){
                fileWriter.write(chars,0,dome);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
