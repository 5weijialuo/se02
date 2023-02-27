package fanShe;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Test02 {
    public static void main(String[] args) throws NoSuchFieldException {
        Cat cat = new Cat();
        Class<? extends Cat> aClass = cat.getClass();

        Constructor<?>[] constructors = aClass.getConstructors();
        for (Constructor<?> s :constructors) {
            System.out.println(s);
        }
        System.out.println("------------");
        Constructor<?>[] constructors1 = aClass.getDeclaredConstructors();
        for (Constructor<?> s :constructors1) {
            System.out.println(s);
        }
        System.out.println("------------");
        Method[] declaredMethods = aClass.getDeclaredMethods();
        for (Method m :
                declaredMethods) {
            System.out.println(m);
        }

        System.out.println("------------");
        Field[] declaredFields = aClass.getDeclaredFields();
        for (Field f :
                declaredFields) {
            System.out.println(f);
        }



    }
}
