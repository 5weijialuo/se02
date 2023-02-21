package main.java;

import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;

import java.util.Scanner;

public class LogTest {
    public static Logger logger = LoggerFactory.getLogger(LogTest.class);
    public static void main(String[] args) {

            logger.debug("start!!!");

        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        try {
            if (i!=1){
                System.out.println("i ！= 1"+i);
            }
        }catch (Exception e){
            logger.debug("error is not null");
            logger.error("error"+e);
        }


    }
}
