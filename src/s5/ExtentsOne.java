package s5;

public class ExtentsOne {
    public static void main(String[] args) {
        C c = new C("jiang");
        System.out.println(c.toString());
        D d = new D();
        int time = d.time();
        System.out.println(time);
    }
}
interface A{
    void sum();
}
interface B{
    void sum();
    int time();
}
class C implements A,B{
    private String name;
    private String age;

    private int m(int a,int b){
        return a%b*b;
    }

    @Override
    public String toString() {
        return "C{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    public C(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public C(String name) {
        this(name,"18");
    }

    public C() {
    }

    @Override
    public void sum() {

    }

    @Override
    public int time() {
        return 0;
    }
}
class D extends C{

}
