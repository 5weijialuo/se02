package File;


import java.io.File;
import java.text.SimpleDateFormat;

public class Test01 {
    public static void main(String[] args) {
        File file = new File("D:/SEjava/se02/src/one.txt");
        String name = file.getName();
        System.out.println(name);
        String path = file.getPath();
        System.out.println(path);
        System.out.println(file.length());
        System.out.println(file.isFile());

        File file1 = new File("src/File/one.txt");
        System.out.println(file1.length());
        System.out.println(file1.isFile());

        System.out.println(file1.lastModified());
        System.out.println(new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(file1.lastModified()));
        System.out.println(file1.exists());

        File file2 = new File("src/two.xml");


    }
}
