package File;

import java.io.File;
import java.io.IOException;

/**
 * 在指定目录中找出指定文件
 * */
public class Test04 {
    public static void main(String[] args) throws IOException {
        /*pri("D:/T", "EPIC战锤3全DLC拓展包 带血包.rar");*/
        //D:\T\文件\one.txt
        File file = new File("D:\\T");
        priTwo(file, "one.txt");


    }
    /*
    * 遍历一个目录中的所有文件和目录
    * 需要对空目录或者空文件夹进行非空处理
    * */
    public  static void pri(String s,String e){
        File file = new File(s);
        File[] files = file.listFiles();
        for (File f : files) {
            if ( f!=null&&f.length() != 0){
                if (f.isFile()) {
                    if (f.getName().equals(e)){
                        System.out.println("找到文件,在"+f.getParent()+"-->目录中"+f.getAbsolutePath());
                    }
                }else {
                    pri(f.getAbsolutePath(),e);
                }
            }
        }
/*
                System.out.println(f.getAbsoluteFile());
*/
    }
    /*
    * 改良版
    * */
    public static void priTwo(File file,String s){
        if (file.isDirectory()){
            File[] files = file.listFiles();
            if (files!=null&&files.length>0){
                for (File f:files) {
                    if (f.isFile()){
                        if (f.getName().contains(s)) {
                            System.out.println(f.getAbsolutePath());
                        }
                    }else {
                        priTwo(f,s);
                    }
                }
            }

        }
    }

}
