package s1;


public class test04 {
    public static void main(String[] args) {
        int[] arr=new int[100];
     //   System.out.println(arr.length);
        int max=0;
        int min=1;
        for (int i = 0; i < arr.length; i++) {
            int random = (int) (Math.random() * 100);
            arr[i] = random;

        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max){
                max=arr[i];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            if (arr[i]<min){
                min=arr[i];
            }

        }System.out.println(max);
        System.out.println(min);
    }
}
