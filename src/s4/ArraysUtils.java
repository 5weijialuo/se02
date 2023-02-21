package s4;

public class ArraysUtils {
    public static String toString(int[] arr) {
        String s1 = "";
        for (int i = 0; i < arr.length; i++) {
            String s = ",";
            s1 += arr[i] + s;
        }
        return s1;
    }

    public static double getAerage(double[] arr) {

        double min = arr[0], max = 0, sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
            sum += arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            if (min>=arr[i]){
                min=arr[i];
            }

        }
        System.out.println(max);
        System.out.println(min);

        return (sum - max - min) / (arr.length - 2);

    }
}
