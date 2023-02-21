package thread;

/**
 * 线程创建第一种方式:   继承Thread类
 * */
public class Test01 {
    public static void main(String[] args) {
        Thread myThread01=new MyThread01();
        myThread01.start();//启动该线程
        for (int i = 0; i < 10; i++) {
            System.out.println("主线程执行!"+i);
        }
    }
}
class MyThread01 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("子线程!"+i);
        }
    }
}
