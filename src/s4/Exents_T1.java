package s4;

public class Exents_T1 {
    public static void main(String[] args) {
        B b = new B();
        b.pri();
    }
}

class A {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class B extends A{
    public void pri(){
        setName("狗蛋");
        System.out.println(getName()+"在吃饭");
    }
}