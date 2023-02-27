package factory;

/*简单工厂模式*/
public class Partner {
    public static void main(String[] args) {
        Person person = FactoryTwo.createPerson(true);
        person.pri();
        Person person1 = FactoryTwo.createPerson(false);
        person1.pri();
    }
}

interface Sex{
    void pri();
}

 class Person implements Sex{

     @Override
     public void pri() {

     }
 }

class PersonB extends Person{
    public void pri(){
        System.out.println("boy");
    }
}
class PersonG extends Person{

    public void pri(){
        System.out.println();
    }
}

class FactoryTwo{
    static Person createPerson(boolean b){
        if (b){
            return new PersonB();
        }
        return new PersonG();
    }
}