package s7;



import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
        String s = "123442";
        String s1="hiadjfiasdjfijaidfjas";
        System.out.println(s.matches("[1-3]{6}"));
        System.out.println(s.matches("[0-9]{6,20}"));
        System.out.println(s1.matches("[a-b]{11}"));


        /*电话号码的验证*/
        Test02.Cookie();

    }

    public static void Cookie(){
        while (true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("输入电话号码:------->");
            String next = scanner.next();
            if (next==null){
                System.out.println("null");
            }else if (next.length()>22||next.length()<6){
                System.out.println("电话号码位数不正确");
            }else if (next.matches("^1[0-9]{7,22}")){
                System.out.println("输入正确");
                break;
            }
        }
        }

}
