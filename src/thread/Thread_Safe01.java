package thread;



/*
*关于线程安全的隐患,和线程安全的模拟
**/
public class Thread_Safe01 {
    public  static  int money=1000;
    public static void main(String[] args) {
        Runnable thread_0=new Thread_0();
        Thread thread=new Thread(thread_0,"公司老总");


        new Thread(()->{
            for (int i=0;i<10;i++){
                Thread_Safe01.money-=600;
                if (Thread_Safe01.money<0){
                    throw new MyException(Thread.currentThread().getName());
                }
                System.out.println("公司会计取l钱-------->账户里还有多少！！"+Thread_Safe01.money);
            }

        },"公司账号").start();
        thread.start();

    }
}
class Thread_0 implements Runnable {
    @Override
    public void run() {
        int d=0;
        for (int i=0;i<10;i++) {
            Thread_Safe01.money-=100;
            if (Thread_Safe01.money<0){
                throw new MyException(Thread.currentThread().getName());
            }
             d=Thread_Safe01.money;
            System.out.println(Thread.currentThread().getName()+"----------->我的银行卡里还有"+d);
        }
    }
}
class MyException extends RuntimeException{
    public MyException(String userName) {
        super("余额不足,无法取钱----------------->"+userName);
    }
    public MyException() {
    }
}