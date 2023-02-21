package s6;

public class Test02 {
    public static void main(String[] args) {
        T.C tc=new T.C();
        tc.toString();
        T t = new T();
        T.Money tm=new T().new Money();
        tm.run();
        tm.tom();
        System.out.println(tc.name);
    }
}
class T{
    static class C{
        String name;

    }
    public class Money{
        int d=111;
        public void tom(){
            System.out.println("内部类实例方法");
        }

        void run(){
            System.out.println("run!!!");
        }
    }
}
