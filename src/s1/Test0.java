package s1;


public class Test0 {
    public static void main(String[] args) {
        /*求水仙花数*/
        int a=0,b=0,c=0;
        for (int i = 100; i < 1000; i++) {
           a= i/100%10;
        b=i/10%10;
        c=i%10;

        if ((a*a*a+b*b*b+c*c*c)==i){

            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
            System.out.println(a*a*a);
            System.out.println(b*b*b);
            System.out.println(c*c*c);
            System.out.println(i);
        }else {
            continue;
        }
        }
    }
}
