package fanShe;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class Test04 {
    public static void main(String[] args) throws Exception {
        Class<Cat> catClass = Cat.class;
        Method[] declaredMethods = catClass.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod);
        }

        Method[] declaredMethods1 = catClass.getDeclaredMethods();
        System.out.println(declaredMethods1);

        Method method=catClass.getDeclaredMethod("type", String.class);
        method.setAccessible(true);
        Cat cat = new Cat();
        method.invoke(cat,"将");

        Field list = catClass.getDeclaredField("list");
        ArrayList<Object> objects = new ArrayList<>();
        objects.add(1);
        objects.add("String");
        objects.add(Double.class);
        /*objects.add(cat);*/
        list.set(cat,objects);
        System.out.println(list.get(cat));

        Field field=catClass.getDeclaredField("name");
        Object o = field.get(cat);
        System.out.println(o);

    }
}
