package thread.threadWork;

public class Animal implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i+"<----TimeZone---->"+Thread.currentThread().getName());
            try {
                System.out.println("线程休眠"+Thread.currentThread().getName());
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
