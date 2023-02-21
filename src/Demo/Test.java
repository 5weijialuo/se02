package Demo;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        String s="yyyy-MM-mm";
        SimpleDateFormat ss=new SimpleDateFormat(s);
        Date date = new Date();
        Scanner scanner = new Scanner(System.in);
        String next = scanner.next();

        try {
            System.out.println(String.valueOf(next));
            String format1 = String.valueOf(ss.parse(next));
            System.out.println(format1);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        String format = ss.format(date);
        System.out.println(format);
        System.out.println();
        Dm dm = new Dm();
        System.out.println(dm.toString());
        dm.setIs(false);
        System.out.println(dm.toString());

    }
}
class Dm{
    private boolean is=true;

    @Override
    public String toString() {
        return "Dm{" +
                "is=" + setIs(is) +
                '}';
    }

    public boolean isIs() {
        return is;
    }

    public String  setIs(boolean is){
        this.is=is;
        return is?"上架":"下架";
    }
}
