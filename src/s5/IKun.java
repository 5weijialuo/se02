package s5;

public interface IKun extends Chang, Skip, Rep{

    static void pri(){
        System.out.println("jdk1.8的新特性!!!");
    }

    @Override
    void run();

    @Override
    default void pom() {
        Chang.super.pom();
    }

    @Override
    void S();

    @Override
    void C();
}
