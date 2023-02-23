package thread.treadTime;

import java.util.Date;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Test02 {
    public static void main(String[] args) {
        ScheduledExecutorService service= Executors.newScheduledThreadPool(2);

        service.scheduleWithFixedDelay(new TimerTask() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+""+new Date());
                /*该异常并不会影响其他线程执行*/
                System.out.println(10/0);
            }
        },0,1,TimeUnit.SECONDS);




        service.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"执行"+new Date());
            }
        },0,2,TimeUnit.SECONDS);

    }
}
