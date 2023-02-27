package fanShe;



@MyAnnotationTest(value = "融会贯通",type = 11)
public class AnnotationTest {
    public static void main(String[] args) {
        pri(32);
    }
    static void pri( int d){
        System.out.println(d);
    }
}

class Test{
    public static void main(String[] args) {
        AnnotationTest annotationTest = new AnnotationTest();
        Class<? extends AnnotationTest> aClass = annotationTest.getClass();
        /*判断给该对象是否含有该注解*/
        if (aClass.isAnnotationPresent(MyAnnotationTest.class)){
            MyAnnotationTest declaredAnnotation = aClass.getDeclaredAnnotation(MyAnnotationTest.class);
            String name = declaredAnnotation.name();
            System.out.println(name);
            int type = declaredAnnotation.type();
            System.out.println(type);
            String value = declaredAnnotation.value();
            System.out.println(value);
        }



    }
}