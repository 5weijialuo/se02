package s5;

public class Int implements IKun{
    public static void main(String[] args) {
            IKun.pri();
            IKun iKun=new Int();
            iKun.pom();


    }


    @Override
    public void run() {

    }

    @Override
    public void S() {

    }

    @Override
    public void C() {
    }
}

interface Chang{
    void run();

    default void pom(){
        System.out.println("坤坤唱跳rep打篮球！");
    }


}
interface Skip{
    void S();
    default double pom(int tt, double dd){
        return tt*dd;
    }
}
interface Rep{
    void C();
    default void pom(){
        System.out.println("坤坤rep不太行");
    }
}
