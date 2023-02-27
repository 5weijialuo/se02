package fanShe;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class Test03 {
    public static void main(String[] args) throws Exception {
        Class<Cat> catClass = Cat.class;
        Constructor<Cat> constructor = catClass.getConstructor(int.class,String.class);
        /*获得构造器对象,用构造器对象构建一个新的Cat对象*/
        Cat zhang = constructor.newInstance(11, "zhang");
        System.out.println(zhang);
        System.out.println(constructor);

        System.out.println("-------------------");
        Field name = catClass.getDeclaredField("money");

        System.out.println(name);
        Cat cat = new Cat();
        /*开启暴力反射的权限*/
        name.setAccessible(true);
        name.set(cat,222);
        name.set(zhang,12300);
        System.out.println(cat);
        System.out.println(zhang);
        System.out.println("-------------------");

        Object o = name.get(cat);
        System.out.println(o);
    }
}
