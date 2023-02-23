package thread.treadTime;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.*;

public class Test01 {
    public static void main(String[] args) {
        ExecutorService service=new ThreadPoolExecutor(3,3,4, TimeUnit.MINUTES,new ArrayBlockingQueue<>(5)
        ,Executors.defaultThreadFactory(),new ThreadPoolExecutor.AbortPolicy());


        /*
         * 定时器实现的第一种方式
         * */
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("定时输出");
            }
        },0,2000);

       /* try {
            boolean b = service.awaitTermination(11, TimeUnit.MINUTES);
            System.out.println(b);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/


        Thread thread=new Thread(()-> System.out.println("三秒后执行该任务!"));
        /*service.execute(thread);*/

        /*timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                thread.start();
            }
        }, 3000, 5000);*/


    }
}
