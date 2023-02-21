package s4;

import java.util.Random;

public class Test01 {
    public static int i=100;
    public static void main(String[] args) {
        int[] arr=new int[20];
        for (int j = 3; j < 12; j++) {
            arr[j]=j+arr.length;
        }
        String string = ArraysUtils.toString(arr);
        System.out.println(string);

        double[] drr={22.1,43,7.5,65.4,64,44,99};
        double aerage = ArraysUtils.getAerage(drr);
        System.out.println(aerage);

       /* System.out.println(i++);
        System.out.println(++i);*/

      /*  Random random=new Random();
        for (int j = 0; j < 10; j++) {
            int i = random.nextInt(10);
            System.out.println(i);
        }*/

    }
}
