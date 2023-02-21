package s6;

public class Test03 {
    public static void main(String[] args) {
        Ping ping = new Ping() {
            @Override
            void pri() {
                Class<? extends Ping> aClass = this.getClass();
                System.out.println(aClass);
                System.out.println(aClass.getAnnotatedSuperclass());
                System.out.println(aClass.desiredAssertionStatus());
            }
        };
        ping.pri();
    }
}
abstract class Ping{
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    abstract void pri();
}
