package s2;

public class Test04 {
    public static void main(String[] args) {
        /*  int[] encrypt = Test04.encrypt(2392);*/
        /*for (int i = 0; i < encrypt.length; i++) {
            System.out.println(encrypt[i]);
        }*/
        String pas = Test04.pas(Test04.encrypt(2392));
        System.out.println("-" + pas);
    }

    public static int[] encrypt(int ccc) {
        int a, b, c, d;
        a = ccc / 1000 % 10;
        b = ccc / 100 % 10;
        c = ccc / 10 % 10;
        d = ccc % 10;
        /*System.out.println(a+"+"+b+"+"+c+"+"+d);*/
        int[] arr = {a, b, c, d};
        return arr;
    }

    public static String pas(int[] c) {
        String dom = "";
        for (int i = 0; i < c.length; i++) {
            int i1 = (c[i] + 5) % 10;
            System.out.println(i1);
            System.out.println(-i1);
            dom += i1;
        }
        return dom;
    }
}
