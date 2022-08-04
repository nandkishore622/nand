package com.cg;

public class Garbage {
    public static void main(String[] args) {
        Object a = new Object();
        Object b = new Object();
        Object c = new Object();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        a=b;
        b=c;
        c=a;

        System.out.println("-----------------");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
