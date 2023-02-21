package s1;

public class Test03 {
    public static void main(String[] args) {
        int i=1;
        int d=0;
        while (i<8840){
            i=i*2;
            d++;
        }
        System.out.println(d);


        for (int j = 1; j < 100000000; j++) {
            System.out.println(j*2);
            System.out.println("----------");
            System.out.println(j*=2);
            if (j>8848789){
                break;
            }
        }
    }

}
