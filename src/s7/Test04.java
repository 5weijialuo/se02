package s7;

import java.util.Arrays;

public class Test04 {
    public static void main(String[] args) {
        int[] arr={32,43,45,65,76,778,76,43,24,54,54,454,7,76};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[13]);
        int pri = Test04.pri(arr, 778);
        System.out.println("该数在目标索引"+pri);
    }
    /*实现二分查找法*/
    public static int pri(int[] arr,int target) {
            int max=arr.length;
            int min=0;
            while (true){
                int tt=(max+min)/2;
                if(arr[tt]==target){
                    return tt;
                }else if (arr[tt]>target){
                    max=tt;
                }else if (arr[tt]<target){
                    min=tt;
                }else if (arr[max]==target){
                    return max;
                }else if (arr[min]==target){
                    return min;
                }
            }




            }

}
