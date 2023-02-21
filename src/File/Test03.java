package File;


public class Test03 {
    public static void main(String[] args) {
        int pri = pri(5);
        System.out.println(pri);
        System.out.println(sum(100));
        System.out.println(rid(1));
    }



    public static int rid(int d){
        if (d==10){
            return 1;
        }else {
            return 2*rid(d+1)+2;
        }

    }

    public static int sum(int i){
        if (i==1){
            return i;
        }else {
            return sum(i-1)+i;
        }
    }
    public static int pri(int i){
        if (i==1){
            return i;
        }else {
            return pri(i-1)*i;
        }
    }
}
