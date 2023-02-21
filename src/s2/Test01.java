package s2;

import java.util.Random;

public class Test01 {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println(random);
/*
        int[] ints = new int[1];
        ints[1]=11;
*/
        Test01.t(11,11,1232,323,3232,3232,3324,23,4234,23,4,23,423,4,23,423,4);


    }

    static void t(int...c){
        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]);
        }
    }
    static void sum(){

    }
    static void sum(int c){

    }static void sum(double d){

    }static void sum(int c,double d){

    }static void sum(double d,int c){

    }
}
