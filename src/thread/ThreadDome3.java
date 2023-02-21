package thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;


/*
* 实现多线程的第三种方式,实现callable接口,结合FutureTask
*
* */
public class ThreadDome3 {
    public static void main(String[] args) {
        ThreadE callable=new ThreadE("线程000001");
        FutureTask<String> futureTask=new FutureTask<>(callable);
        Thread thread = new Thread(futureTask);



        ThreadE callable1=new ThreadE("线程000002");
        FutureTask<String> futureTask1=new FutureTask<>(callable1);
        Thread thread1 = new Thread(futureTask1);
        thread1.start();
        thread.start();

          Thread thread2 = Thread.currentThread();


        try {
            String s = futureTask.get();
            String s1=futureTask1.get();
            System.out.println(s);
            System.out.println(s1);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }
}


class ThreadE implements Callable<String>{
    String name;

    public ThreadE(String name) {
        this.name = name;
    }

    @Override
    public String call() throws Exception {
        return "返回该接口的结果"+name;
    }
}

