package fanShe;

import java.util.ArrayList;
import java.util.List;

public class Cat {
    private int money;
    String name="杰瑞";
    protected List<String> list=new ArrayList<>();

    public Cat(int money, String name, List<String> list) {
        this.money = money;
        this.name = name;
        this.list = list;
    }

    public Cat(){
    }

    @Override
    public String toString() {
        return "Cat{" +
                "money=" + money +
                ", name='" + name + '\'' +
                ", list=" + list +
                '}';
    }

    private Cat(int money){
        this.money=money;
    }

    public Cat(int money, String name) {
        this.money = money;
        this.name = name;
    }

    public static void pri(){
        System.out.println("pri");
    }

    int  sum(int d,int  f){
        System.out.println("pri"+money+"--->"+name);
        return d+f;
    }

    private void type(String name){
        System.out.println(name+"私有的方法");
    }


}
