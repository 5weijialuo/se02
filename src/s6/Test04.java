package s6;

import java.util.Objects;

public class Test04 {
    String user;

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public static void main(String[] args) {
        Jar jar=null;
        Jar jar1=new Jar();
        System.out.println(jar);
        System.out.println(jar1);
        /*System.out.println(jar.equals(jar1));*/
        boolean equals = Objects.equals(jar, jar1);
        System.out.println(equals);
        System.out.println(Objects.hashCode(jar));
    }
}
final   class Jar{
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Jar jar = (Jar) o;
        return Objects.equals(name, jar.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Jar{" +
                "name='" + name + '\'' +
                '}';
    }

    String name="jar";
    void pri(){
        System.out.print("****");
    }
}
