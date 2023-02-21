package thread;


/*
* 创建线程的第二种方法:   实现Runnable接口,并实现run方法
* */
public class ThreadDemo01 {
    public static void main(String[] args) {
        Runnable thread=new ThreadT();
        Thread thread1=new Thread(thread);
        thread1.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("主线程执行!"+i);
        }

    }
}
class  ThreadT implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("子线程!"+i);
        }

    }
}
