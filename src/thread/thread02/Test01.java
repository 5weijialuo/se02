package thread.thread02;

public class Test01 {
    public static void main(String[] args) {



    }
}
class MyThread extends Thread{
    @Override
    public void run() {
        super.run();
    }
}



class Account{
    int money;

    void getMoney(int d,String name){
        if (money<=0){
            System.out.println(money+"--->余额");
        }

    }

}
