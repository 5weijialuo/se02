package s7;

public class Test05 {
    public static void main(String[] args) {
        Animal animal=()->{
            System.out.println("tomcat");
        };

        animal.run();
        Math math=(i,d,f)->{return i*d*f;};

        System.out.println(math.cj(1, 2, 4));
        
        pri(()-> System.out.println("Dog is a Animal!!!!"));
    }
    public static void pri(Animal animal){
        animal.run();
    }
}
@FunctionalInterface
interface Animal{
     void run();
}
interface Math{
    int cj(int i,int j,int t);
}


