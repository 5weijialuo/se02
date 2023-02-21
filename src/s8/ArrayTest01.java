package s8;

import java.util.Random;

public class ArrayTest01 {
    public static void main(String[] args) {
        int[] arr=new int[7];
        Random random=new Random();
        for (int j=0;j<arr.length-1;j++){
            /*for (int i=0;i<33;i++){*/
                int i1 = random.nextInt(33);
                if (i1==0){
                    i1+=1;
                }
            arr[j]=i1;
           /* }*/
        }

        for (int i:arr) {
            System.out.println(i);
        }




      /*  int[] a={};
        System.out.println(a.length==0);
        if (a.length==0){
            System.out.println("[]");
        }
        int d=904;
        System.out.println(d/100%10);
        System.out.println(d/10%10);
        System.out.println(d%100%10);*/
    }
}
