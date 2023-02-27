package fanShe;

import java.util.ArrayList;

public class Dog {
    private int  age=5;
    private String name="汤姆";
    private String address="北京";
    private ArrayList arrayList=new ArrayList();

    public Dog() {
    }

    public Dog(int age, String name, String address, ArrayList arrayList) {
        this.age = age;
        this.name = name;
        this.address = address;
        this.arrayList = arrayList;
    }
    void pri(){
        System.out.println(age);
        System.out.println(name);
        System.out.println(address);
        System.out.println(arrayList);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", arrayList=" + arrayList +
                '}';
    }
}
