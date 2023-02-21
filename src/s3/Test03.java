package s3;

import java.util.Scanner;

public class Test03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[3];
        for (int i = 0; i < 3; i++) {

            arr[i] = scanner.nextInt();
            if (arr[i] == 1) {
                break;
            }
        }
        int a=arr[0];
        int b=arr[1];
        int c=arr[2];
        int sum = 0;
//        arr的在三个下标间，对全部进行为零判定，将不为0的下标用两个变量记住，进行两个减一操作，，若两个变量其中一个
//        被减为0，最后一个下标进行判定，直至将三个下标的数被全部减为0
//
        while (true)
        if (a==0){
            b-=b;
            c-=c;
        }else if (b==0){
            a-=a;
            c-=b;
        }else if (c==0){
            a-=a;
            b-=b;
        }


    }

}

