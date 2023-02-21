package s5;

public class AbsClass {

}
abstract class TK{
    private String name;

    public TK(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public TK() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    private int money;
    abstract double discountCoupon(double d);
}
class T3 extends TK {
    double discountCoupon(double d) {
        super.setMoney(8000);
        return d*0.8;
    }
}

class T5 extends TK {


    double discountCoupon(double d) {
        super.setMoney(10000);
        return d*0.85;
    }
}
