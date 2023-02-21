package s2;


public class Test03 {
    public static void main(String[] args) {
        String ps = Test03.ps();
        System.out.println(ps);
    }

    public  static  String  ps(){
        String pas = "";
        for (int i = 0; i < 5; i++) {
            int random = (int) (Math.random()*10);
            String s = String.valueOf(random);
            pas+=s;
        }
        return pas;
    }


}
