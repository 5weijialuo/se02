package IO;


import java.io.*;

public class Stream02 {
    public static void main(String[] args) throws ClassNotFoundException {
        Animal animal = new Animal("tomcat",123456);
        /*Animal animal1 = new Animal("Dog");*/


        /*
        * 对象序列化和对象反序列化
        * */

        try (
                ObjectOutputStream objectOutputStream=new ObjectOutputStream(new FileOutputStream("src/Object.txt",true));
                 FileInputStream fileInputStream = new FileInputStream("src/Object.txt");
                 ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);

        ){
            objectOutputStream.writeObject(animal);
            Animal animal1= (Animal) objectInputStream.readObject();
            System.out.println(animal1);

            /*objectOutputStream.writeObject(animal1);*/
           /* Object object;
            while ((object=objectInputStream.readObject())!=null){
                System.out.println(object);
            }*/



        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
class Animal implements Serializable {
    private static final long serialVersionUID=2;

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", password=" + password +
                '}';
    }

    public Animal(String name, int password) {
        this.name = name;
        this.password = password;
    }

    public Animal(String name){
        this.name=name;
    }
     String name;
     transient int password;

}
