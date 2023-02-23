package thread.threadWork;

import Demo.config.LoginException;

import java.util.concurrent.*;



/*
* 使用线程工具类提供的API进行线程池的创建!
* */
public class Test03 {
    public static void main(String[] args) {
        ExecutorService service=new ThreadPoolExecutor(3,7,3, TimeUnit.MINUTES,new ArrayBlockingQueue<>(3),
                Executors.privilegedThreadFactory(),new ThreadPoolExecutor.AbortPolicy());


            /*      构建
            * */
        /*ExecutorService service1 = Executors.newCachedThreadPool();*/
        /*ExecutorService service1 = Executors.newSingleThreadExecutor();*/
        ExecutorService service1 = Executors.newFixedThreadPool(3);
        Thread thread=new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(i+"线程执行--------->"+Thread.currentThread().getName()+"---->");
            }
        });
        service1.execute(thread);
        service1.execute(thread);
        service1.execute(thread);
        service1.execute(thread);
        Thread thread1=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("som");
                throw new LoginException("fdsf");
            }
        });
        service1.execute(thread1);

    }
}
