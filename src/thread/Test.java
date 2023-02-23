package thread;

public class Test {
    public static void main(String[] args) {
        Dome1 dome1=new Dome1();
        Thread thread=new Thread((Runnable) dome1,"第一线程");
        thread.start();
        System.out.println(thread.getName());

       Dome1 dom=new thread.Dome1();
        Thread thread1=new Thread((Runnable) dom,"第二线程");
        thread1.start();
        System.out.println(thread1.getName());
        try {
            Thread.sleep(1000);
            Thread.currentThread().setName("main线程--------------->");
            System.out.println(Thread.currentThread().getName()+"执行");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
class Dome1 implements Runnable{
    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"执行"+i);
        }

        /*Thread thread =Thread.currentThread();*/
         /*ThreadGroup threadGroup = thread.getThreadGroup();*/
        /*System.out.println(threadGroup);*/
        /*System.out.println(thread.getId());
        System.out.println(thread.getName());
        thread.setName("第一线程!");*/

    }
}
