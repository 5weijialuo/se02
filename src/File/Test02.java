package File;

import java.io.File;
import java.io.IOException;
import java.util.Objects;

public class Test02 {
    public static void main(String[] args) throws IOException {
        File file = new File("src/File/projectConfig.xml");
        System.out.println(file.createNewFile());
        System.out.println(file.mkdir());
        System.out.println(file.delete());

        System.out.println("------------------");
        File file1 = new File("C:\\Users\\21355\\Pictures\\Camera Roll/aa/bb/cc/dd/mm");
        /*System.out.println(file1.mkdirs());*/
        System.out.println(file1.delete());

        System.out.println("------------------");
        File file2 = new File("C:\\Users\\21355\\Pictures/Camera Roll");
        String[] list = file2.list();
        for (String s :
                list) {
            System.out.println(s);
        }
        System.out.println("------------------");
        File[] files = file2.listFiles();
        for (File f :
                files) {
            System.out.println(f.getAbsoluteFile());
        }
        System.out.println("------------------");

        File[] listFiles = file2.listFiles(Objects::isNull);
        for (File f :
                listFiles) {
            System.out.println(f.getAbsoluteFile());
        }

    }
}
