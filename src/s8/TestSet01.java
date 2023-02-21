package s8;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class TestSet01 implements Comparable{
    public static void main(String[] args) {
        Set<Dog> set=new HashSet<>();
        Dog qiu= new Dog("静秋", 22);
        Dog qiu1 = new Dog("静秋", 21);
        Dog qiu2 = new Dog("y秋", 24);

        set.add(qiu);
        set.add(qiu1);
        set.add(qiu2);

        System.out.println(set);

    }

    @Override
    public int compareTo(Object o) {
        return this.compareTo(0);
    }
}
class Dog{
    private String name;
    private int age;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return age == dog.age && Objects.equals(name, dog.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public Dog() {
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

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

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
