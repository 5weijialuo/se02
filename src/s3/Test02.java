package s3;

public class Test02 {
    public static void main(String[] args) {
        B b = new B(1,"江","北京");
        System.out.println(b);
    }
}
class A{
    public int getId() {
        return id;
    }

    private int id;
    String name;

    public A() {
        this.getId();
    }

    public A(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
class B extends A{
    String address;

    public B() {
    }

    @Override
    public String toString() {
        return "B{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public B(int id, String name, String address) {
        super(id, name);
        this.address = address;
    }
}