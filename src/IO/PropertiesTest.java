package IO;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

import java.io.*;
import java.util.Properties;

public class PropertiesTest {
    public static void main(String[] args) throws Exception{
        int ioUtils=IOUtils.copy(new FileInputStream("src/IO/one.properties"),new FileOutputStream("D:/javaSE/two.properties"));
        System.out.println(ioUtils);

        FileUtils.copyDirectory(new File("D:/javaSE/log"),new File("D:/javaSE"));

        /*roperties properties=new Properties();
        properties.setProperty("江","123456");
        try {
            properties.store(new FileWriter("src/IO/one.properties"),"写入该文件");
        } catch (IOException e) {
            e.printStackTrace();
        }

       Object d = properties.get("江");
        System.out.println(d);*/
    }
}
