package xml;

import java.util.ArrayList;

public class Cat {
    private String name;
    private int age;
    private String Array;
    private ArrayList<String> arrayList;

    public Cat() {
    }

    public Cat(String name, int age, String array, ArrayList<String> arrayList) {
        this.name = name;
        this.age = age;
        Array = array;
        this.arrayList = arrayList;
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

    public String getArray() {
        return Array;
    }

    public void setArray(String array) {
        Array = array;
    }

    public ArrayList<String> getArrayList() {
        return arrayList;
    }

    public void setArrayList(ArrayList<String> arrayList) {
        this.arrayList = arrayList;
    }
}