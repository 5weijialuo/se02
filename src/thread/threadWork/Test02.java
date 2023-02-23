package thread.threadWork;

import java.util.concurrent.*;

public class Test02 {
    public static void main(String[] args) {
        Thread thread2=new Thread(new Animal());
        /*创建线程池*/
        ExecutorService pool=new ThreadPoolExecutor(3,5,3, TimeUnit.SECONDS
                ,new ArrayBlockingQueue<>(3), Executors.defaultThreadFactory(),new ThreadPoolExecutor.AbortPolicy());

        Callable cat = new Cat();
        Future<String> submit = pool.submit(cat);
        Future submit1 = pool.submit(cat);
        if (cat instanceof Cat){

        }
        Future<String> submit2 = pool.submit(cat);
        Future<String> submit3 = pool.submit(cat);
        Future<String> submit4 = pool.submit(cat);
        Future<String> submit5 = pool.submit(cat);
        try {
            System.out.println(submit.get());
            System.out.println(submit1.get());
            System.out.println(submit2.get());
            System.out.println(submit3.get());
            System.out.println(submit4.get());
            System.out.println(submit5.get());
        }catch (Exception e){
            System.out.println(e.getLocalizedMessage());
        }
        tome();

    }
    public static void tome(){
        Gun gun=new Gun();
        FutureTask futureTask=new FutureTask(gun);
        Thread thread=new Thread(futureTask);
        thread.start();
        Object o = null;
        try {
            o = futureTask.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        System.out.println(o);


    }



}



class Gun implements Callable<String>{

    @Override
    public String call() throws Exception {
        return "继承Callable接口后,如此实现多线程!";
    }
}
