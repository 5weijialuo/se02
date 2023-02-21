package s7;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Test03 {
    public static void main(String[] args) {
        int[] arr={312,213123,2313,232,32,545,45,45,45,51,5,16,1,51,2,1,21,15,1,51,51,56};
        /*Arrays.sort(arr,2,arr.length);*/
        Arrays.sort(arr);
        for (int i:arr){
            System.out.println(i+"\t");
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(arr.length);
        System.out.println(Arrays.binarySearch(arr,22));

        System.out.println("--------------");
        int[] a1={1,2,3};
        int[] b={1,2,3};
        System.out.println(Arrays.equals(a1,b));
        Arrays.fill(a1,3);


        for (int i:a1){
            System.out.println(i);
        }

        System.out.println();
    }
}
