package s6;

public class Test01 {
    public static void main(String[] args) {
        Animal dog=new Dog();
        Animal cat=new Cat();
        dog.run();
        cat.run();
        System.out.println(cat.name);
        System.out.println(dog.name);
       Cat cat1= (Cat) cat;
       cat1.run();


    }
}
abstract class Animal{
    String name="动物";
    abstract void run();
}
class Dog extends Animal{
    public Dog(){
        this.name="Dog---->";
    }

    @Override
    void run() {

        System.out.println("Dog");
    }
}
class Cat extends Animal{

    @Override
    void run() {
        System.out.println("Cat");
    }
}
