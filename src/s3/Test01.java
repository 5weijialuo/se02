package s3;


import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        ShoppingCar shoppingCar = new ShoppingCar();
        Commodity commodity = new Commodity("鸡", 2.5, "深圳");
        Commodity commodity3 = new Commodity("鸭", 2.5, "深圳");
        while (true) {
            System.out.println("输入：---->");
            Scanner scanner = new Scanner(System.in);
            int i = scanner.nextInt();
            switch (i){
                case 1:
                    shoppingCar.add(commodity);
                    break;
                case 2:
                    shoppingCar.clearing(commodity);
                case 3:
                    System.exit(1);

            }

        }
    }
}


class Commodity {
    @Override
    public String toString() {
        return "Commodity{" +
                "anInt=" + anInt +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", address='" + address + '\'' +
                '}';
    }

    public Commodity(String name, double price, String address) {
        this.name = name;
        this.price = price;
        this.address = address;
    }

    public Commodity() {
    }

    public int getAnInt() {
        return anInt;
    }

    private int anInt=1;

    public void setAnInt(int anInt) {
        this.anInt = anInt;
    }

    String name;
    double price;
    String address;
}

class ShoppingCar {

            void all(){



            }

    void  add(Commodity commodity){
        while (true){
            System.out.println("输入1，默认1。反之！输入数量：");
            Scanner scanner = new Scanner(System.in);
            int i = scanner.nextInt();
            if (i != 1&&i>=0) {
                commodity.setAnInt(i);
                System.out.println("添加" + i + "件");
                System.out.println(commodity.toString());
            }
            break;
        }
    }


    void clearing(Commodity commodity) {
        System.out.println("结算"+commodity.getAnInt()+"件");
        System.out.println("共："+commodity.getAnInt()*commodity.price);
    }

}
