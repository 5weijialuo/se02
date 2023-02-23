package thread.threadWork;



/*
* 创建线程池
* 处理Runnable的线程
* 处理Callable的线程
* */

import java.util.concurrent.*;

public class Test {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal animal1 = new Animal();
        Thread thread=new Thread(animal,"第一线程");
        Thread thread1=new Thread(animal1,"核心线程");
        Thread thread2=new Thread(new Animal());
       /*创建线程池*/
        ExecutorService pool=new ThreadPoolExecutor(3,5,3, TimeUnit.SECONDS
                ,new ArrayBlockingQueue<>(2), Executors.defaultThreadFactory(),new ThreadPoolExecutor.AbortPolicy());

        /*给任务给线程池处理*/
        pool.execute(thread);
        pool.execute(thread1);
        pool.execute(thread2);
        pool.execute(thread2);
        pool.execute(thread2);
        pool.execute(thread2);
        pool.execute(thread2);
        pool.execute(thread2);

    }
}


