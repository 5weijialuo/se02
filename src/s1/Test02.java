package s1;

public class Test02 {
    public static void main(String[] args) {
        int a=2;

        System.out.println(a++);


        int b=5;
        System.out.println(--b);

        System.out.println(b>=1?"比b小":"比b大");


        int sum=0;
        for (int d=0;d<100;d++){
            sum+=d;

        }
        System.out.println(sum);

        int s=0;
        for (int i = 1; i < 100; i++) {
            if (i%2==1){
                System.out.println(i);
                System.out.println(s+=i);
            }
        }
    }
}
