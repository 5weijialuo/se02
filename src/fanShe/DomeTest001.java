package fanShe;
import thread.threadWork.Animal;

import java.io.*;
import java.lang.reflect.*;

public class DomeTest001 {
    public static void main(String[] args) {
       /* Cat tom = new Cat(123456, "张三");
        resolve(tom);*/
        try {
            resolve(new Dog());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    /*设计分解对象的方法,并将其成员变量写入属性文件中*/
    /*定向打印流,将数据写入文件中*/
    static void resolve(Object object) throws IOException {
        Class<?> aClass = object.getClass();


        Field[] declaredFields = aClass.getDeclaredFields();
        Method[] declaredMethods = aClass.getDeclaredMethods();
        OutputStream outputStream=new FileOutputStream("cat.properties",true);
        PrintStream stream=new PrintStream(outputStream);
        Constructor<?>[] declaredConstructors = aClass.getDeclaredConstructors();
        stream.write(("---------------------"+aClass.getSimpleName()+"---------------------").getBytes());
        stream.write("\r\n".getBytes());

        for (Field declaredField : declaredFields) {
            try {
                declaredField.setAccessible(true);
                String s=declaredField.getName();
                Object o=declaredField.get(object);

                stream.write(s.getBytes());
                stream.write(("  "+"="+" ").getBytes());
                stream.write(o.toString().getBytes());
                stream.write("\r\n".getBytes());
                stream.flush();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        for (Method method : declaredMethods) {
            Class<?> returnType = method.getReturnType();
            String name = method.getName();
            try {
                stream.write(returnType.toString().getBytes());
                stream.write(("  "+"="+" ").getBytes());
                stream.write(name.getBytes());
                stream.write("\r\n".getBytes());
                stream.flush();
            }catch (Exception e){
                e.printStackTrace();
            }
        }



    }
}