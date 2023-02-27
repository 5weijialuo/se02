package fanShe;


import java.util.Arrays;

public class Test01 {
    public static void main(String[] args) {
        Ca ca = new Ca();
        Class<? extends Ca> aClass = ca.getClass();
        Class<?> aClass1 = Ca.class;
        try {
            Class<?> aClass2 = Class.forName("fanShe.Ca");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(Arrays.toString(aClass.getFields()));
        System.out.println(Arrays.toString(aClass.getConstructors()));

    }


}
class Ca{
    private int dom;
    String name;

    public Ca(){
    }

    public Ca(int dom, String name) {
        this.dom = dom;
        this.name = name;
    }

    String pri(String name,String password){
        if (name.equals("root")&&password.equals("123456")){
            return "true";
        }
        return "false";
    }
}
