package error;

import java.util.Objects;
import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
        try {
            tom();
        } catch (MyException e) {
            e.printStackTrace();
        }


    }

    public static void tom() throws MyException {
        Scanner scanner = new Scanner(System.in);
        int next = scanner.nextInt();
        if (next!=1){
            throw new MyException("is not == 1");
        }else {
            System.out.println("true");
        }
    }
}

class MyException extends Exception{
    public MyException(){
    }

    public MyException(String message) {
        super(message);
    }

}
