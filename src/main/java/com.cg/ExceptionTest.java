package com.cg;

public class ExceptionTest {
    public static void main(String[] args) {
        System.out.println(m1());
    }

    public static int m1(){
        try{
            System.out.println("try");
            String s1 = null;
//            s1.toLowerCase();
            return 1;
        } catch (Exception e) {
            System.out.println("catch");
            return 2;
        }finally {
            System.out.println("finally");
            return 3;
        }
//        return 4;
    }
}
