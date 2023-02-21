package s6;

public class Test05 {
    public static void main(String[] args) {
        StringBuilder stringBuilder=new StringBuilder("东西南北");
        StringBuilder fds = stringBuilder.append("fds");
        System.out.println(fds);
        StringBuilder tom = stringBuilder.reverse().append("tom");
        System.out.println(tom);
        int length = tom.length();
        System.out.println(length);

    }
}
