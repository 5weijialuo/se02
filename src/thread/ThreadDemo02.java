package thread;

import java.util.concurrent.Callable;

public class ThreadDemo02 {
    public static void main(String[] args) {


        Runnable runnable= () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("子线程!"+i);
            }
        };
        Thread thread=new Thread(runnable);
        thread.start();


        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("子线程Two执行!"+i);
            }
        }).start();


        for (int i = 0; i < 10; i++) {
            System.out.println("主线程执行!"+i);
        }
    }
}
